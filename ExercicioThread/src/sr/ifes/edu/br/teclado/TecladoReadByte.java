package sr.ifes.edu.br.teclado;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author felipe
 */
public class TecladoReadByte {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStream = new  InputStreamReader( System.in );        
        System.out.print("Enter a line:");
        String input= "";        
        int data = inputStream.read();
        input +=  (char)(data);
           while ((char)(data) != '\n') {              
              data = inputStream.read();
              char caracter = (char)(data);              
              input += caracter;
        }
        System.out.print(input);
        inputStream.close();                                
    }

}
