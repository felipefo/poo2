/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization.exercicio;

/**
 *
 * @author felipe
 */
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
