/*
 Classe exemplo de como ler uma informacao na web
 */
package sr.ifes.edu.br.URLconnection;


import java.net.*;
import java.io.*;

public class URLConnectionReader {

    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.oracle.com/");
        URLConnection urlConnection = oracle.openConnection();
        BufferedReader in = new BufferedReader(new 
        InputStreamReader(urlConnection.getInputStream()));        
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
