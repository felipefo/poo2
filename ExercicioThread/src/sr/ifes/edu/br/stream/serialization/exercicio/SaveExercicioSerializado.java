/*
    Exercicios que mostra como ler um arquivo e salvar os dados de um arquivo em outro arquivo.
 */
package sr.ifes.edu.br.stream.serialization.exercicio;

import java.io.*;

public class SaveExercicioSerializado {
    
    
    
    public void save(Blog blog) throws IOException{
                        
        String current = new java.io.File( "." ).getCanonicalPath();                       
        FileOutputStream fileSerializado = new FileOutputStream( current + "\\src\\exercicio_serializado.sr");        
        //TODO:finalizar 
        
    }
}

   
