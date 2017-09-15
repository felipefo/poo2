
package iceadventure;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Animal {
     
    String tipo;
    String filePath = "";
    
    public Animal(String tipo){
      this.tipo = tipo;
      File file = new File(".");
        try {
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }                  
    }    
       
    public String getTipo(){
        return this.tipo;
    }
    
}
