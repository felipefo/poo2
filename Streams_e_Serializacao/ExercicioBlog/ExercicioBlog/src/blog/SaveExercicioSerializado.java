
package blog;

import java.io.*;


public class SaveExercicioSerializado {
    
    
    
    public void save(Blog blog) throws IOException{
                        
        String current = new java.io.File( "." ).getCanonicalPath();                       
        FileOutputStream fileSerializado = new FileOutputStream( current + "\\src\\exercicio_serializado.sr");        
          ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(blog);
        outputSerializado.close();
        
    }
}

   
