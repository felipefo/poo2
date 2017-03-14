/*
Exercicio exemplo de pipe stream entre threads.
 */
package pipe;

import java.io.*;


public class Main {
    
    public static void main(String[] args) throws IOException {

        
        String current = new java.io.File( "." ).getCanonicalPath();        
        FileReader words = new FileReader(current + "\\src\\words.txt");

        // do the reversing and sorting
        Reader rhymedWords = reverse(sort(reverse(words)));

        // write new list to standard out
        BufferedReader in = new BufferedReader(rhymedWords);
        String input;

        while ((input = in.readLine()) != null)
            System.out.println(input);
        in.close();
    }

    public static Reader reverse(Reader source) throws IOException {

        BufferedReader in = new BufferedReader(source);

        //criando o pipe
        PipedWriter pipeOut = new PipedWriter();
        PipedReader pipeIn = new PipedReader(pipeOut);
        PrintWriter out = new PrintWriter(pipeOut);

        new ReverseThread(out, in).start();//inicia a thread
        return pipeIn;//resultado que vai ser passado para a proxima thread
    }

    public static Reader sort(Reader source) throws IOException {

        BufferedReader in = new BufferedReader(source);

        //criando o pipe
        PipedWriter pipeOut = new PipedWriter();
        PipedReader pipeIn = new PipedReader(pipeOut);
        PrintWriter out = new PrintWriter(pipeOut);

        new SortThread(out, in).start();//inicia a thread
        return pipeIn;//resultado que vai ser passado para a proxima thread
    }
    


    
}
