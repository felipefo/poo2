package game;

import java.awt.Rectangle;
import org.newdawn.slick.GameContainer;


public class ControleColisao  extends Colisao{

    private Heroi heroi = null;
    private Inimigo zumbi = null;
    private GameContainer controller;    
    
    public ControleColisao(GameContainer controller) {
        this.controller = controller;        
    }
    @Override
    public void update(Observavel ob) {
        if (ob instanceof Heroi) 
            this.heroi = (Heroi) ob;
         else if (ob instanceof Inimigo) 
            this.zumbi = (Inimigo) ob;                 
        if (this.heroi != null && this.zumbi != null) {
            Rectangle first = new Rectangle(heroi.getPosX(), heroi.getPosY(),
                    heroi.getImage().getWidth() - 25, heroi.getImage().getHeight() - 25);
            Rectangle second = new Rectangle(zumbi.getPosX(), zumbi.getPosY(),
                    zumbi.getImage().getWidth() - 25, zumbi.getImage().getHeight() - 25);
            if (first.intersects(second)) {
                controller.pause();
            }
        }
    }
}
