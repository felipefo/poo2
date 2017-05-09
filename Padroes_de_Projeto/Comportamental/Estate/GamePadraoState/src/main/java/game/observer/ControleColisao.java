package game.observer;

import game.state.GameOver;
import game.state.SetupGame;
import game.state.State;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author felipe
 */
public class ControleColisao implements Observador {

    private Heroi heroi = null;
    private Zumbi zumbi = null;
    private SetupGame gameState;    
    
    public ControleColisao(SetupGame gameState) {
        this.gameState = gameState;        
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
                gameState.setNextState();
            }
        }
    }
}
