package game.observer;

import java.awt.Rectangle;
import org.newdawn.slick.GameContainer;

/**
 *
 * @author felipe
 */
public class ControleColisao implements Observador {

    private Heroi heroi = null;
    private Zumbi zumbi = null;
    private GameContainer controller;    
    
    public ControleColisao(GameContainer controller) {
        this.controller = controller;        
    }
    @Override
    public void update(Observavel ob) {
        if (ob instanceof Heroi) 
            this.heroi = (Heroi) ob;
         else if (ob instanceof Zumbi) 
            this.zumbi = (Zumbi) ob;        
        if (this.heroi != null && this.zumbi != null) {
            Rectangle first = new Rectangle(heroi.getPosX(), heroi.getPosY(),
                    heroi.getImage().getWidth() - 20, heroi.getImage().getHeight() - 20);
            Rectangle second = new Rectangle(zumbi.getPosX(), zumbi.getPosY(),
                    zumbi.getImage().getWidth() - 20, zumbi.getImage().getHeight() - 20);
            if (first.intersects(second)) {
                controller.pause();
            }
        }
    }
}
