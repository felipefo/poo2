package sr.ifes.edu.br.teclado;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author felipe
 */
public class TecladoReadChar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //InputStream inputstream;
        
        BufferedReader stdin = new BufferedReader(
                new  InputStreamReader( System.in ) );
        
        System.out.print("Enter a line:");
        System.out.println(stdin.readLine());                         
        stdin.close();        
    }
    

}
