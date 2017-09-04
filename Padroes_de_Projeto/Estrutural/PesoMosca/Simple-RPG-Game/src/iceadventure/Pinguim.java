
package iceadventure;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


class Pinguim extends Animal {    
    Image image;
      public Pinguim(){
        super("pinguim");
        try {
             String path = filePath + "\\images\\Penguine.png";            
            image = new Image(path);
        } catch (SlickException ex) {
            Logger.getLogger(Pinguim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getImage(){        
        return this.image;
    }
    public void render(int x, int y){
        image.draw(x, y);
    }
    @Override
    public String getTipo() {
       return "pinguim"; 
    }
}
