
package iceadventure;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Fish extends Animal{    
    Image image;
    int posX;
    int posY;
    public Fish(int posX, int posY){ 
        super("fish");
        this.posX = posX;
        this.posY = posY;
        try {
             String path = filePath + "\\images\\fish.png";            
            image = new Image(path);
        } catch (SlickException ex) {
            Logger.getLogger(Fish.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getImage(){        
        return this.image;
    }
    public void render(){
        image.draw(this.posX, this.posY);
    }
    
    public int getPosX() {
        return posX;
    }
    
    public void setPosX(int posX) {
        this.posX = posX;
    }
    
    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String getTipo() {
        return "fish";
    }

}
