
package iceadventure;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


class IceAge extends Animal {    
    Image image;
    public IceAge(){
        super("iceage");
        try {
             String path = filePath + "\\images\\iceAge1.png";            
            image = new Image(path);
        } catch (SlickException ex) {
            Logger.getLogger(IceAge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getImage(){        
        return this.image;
    }
    public void render(int x , int y){
        image.draw(x, y);
    }
    @Override
    public String getTipo() {
       return "iceage"; 
    }
}
