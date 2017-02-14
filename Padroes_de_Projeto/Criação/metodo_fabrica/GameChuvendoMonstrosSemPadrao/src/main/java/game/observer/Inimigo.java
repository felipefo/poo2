
package game.observer;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author felipe
 */
public class Inimigo extends PersonagemPadrao implements Observador{
        
    
    public Inimigo(String pathImage, int posX, int posY) {
        super(pathImage, posX, posY);
    }
    @Override
    public void update(Observavel ob) {
        moveInimigo((Heroi) ob);
    }
    public void moveInimigo(Heroi heroi){        
        
        if(this.posY >= 400){
            this.posY = -20;
            this.posX = ThreadLocalRandom.current().nextInt(0, 640);
        }
        else{
            this.posY = this.posY + 5;            
        }                        
    }
}
