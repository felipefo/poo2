package game.observer;

import game.state.personagem.Pausado;
import game.state.jogo.SetupGame;
import java.awt.Rectangle;


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
             Rectangle first = new Rectangle(heroi.getPosX() + heroi.getImage().getWidth() -10  , heroi.getPosY(),
                    heroi.getImage().getWidth() - 5, heroi.getImage().getHeight());             
            Rectangle second = new Rectangle(zumbi.getPosX() + zumbi.getImage().getWidth()/2, zumbi.getPosY(),
                    zumbi.getImage().getWidth(), zumbi.getImage().getHeight());
            if (first.intersects(second)) {                
                if(!(zumbi.getCurrentState() instanceof Pausado))
                    zumbi.goNextState();
                return;
            }             
         }       
         if (this.heroi != null && this.zumbi != null) {
            Rectangle first = new Rectangle(heroi.getPosX(), heroi.getPosY(),
                    heroi.getImage().getWidth(), heroi.getImage().getHeight());
            Rectangle second = new Rectangle(zumbi.getPosX() -10, zumbi.getPosY(),
                    zumbi.getImage().getWidth() - zumbi.getImage().getWidth()/2 -10, zumbi.getImage().getHeight());
            if (first.intersects(second)) {                
                gameState.goNextState();
            }
        }
    }
}
