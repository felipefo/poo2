
package sr.ifes.edu.br.stream.serialization.exercicio;


import java.io.*;

public class RecuperarExercicioSerializado {

    public Blog recupera( ) throws Exception {
        {
            Blog blog = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + "\\src\\exercicio_serializado.sr");
            //TODO:finalizar 
            
            return blog;
        }
    }
}
