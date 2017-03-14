
package blog;

import java.io.*;

public class RecuperarExercicioSerializado {

    public Blog recupera( ) throws Exception {
        {
            
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + "\\src\\exercicio_serializado.sr");
            //TODO:finalizar 
             ObjectInputStream in = new ObjectInputStream(fileIn);             
            Object object= in.readObject();          
            in.close();
            
            
            return (Blog) object;
        }
    }
}
