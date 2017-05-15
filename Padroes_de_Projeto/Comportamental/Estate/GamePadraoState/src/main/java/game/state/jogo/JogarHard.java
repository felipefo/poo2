
package game.state.jogo;

import game.observer.SimpleSlickGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;


public class JogarHard extends State{
   
    private int timeInterval = 10;
    private int timeCount=0;
        
    @Override
    public void doAction(GameContainer gc, SimpleSlickGame sl, int i) {
        
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_UP))
            sl.heroi.setPosY(sl.heroi.getPosY() - 1);        
        if (input.isKeyDown(Input.KEY_DOWN)) 
            sl.heroi.setPosY(sl.heroi.getPosY() + 1);        
        if (input.isKeyDown(Input.KEY_LEFT)) 
            sl.heroi.setPosX(sl.heroi.getPosX() - 1);        
        if (input.isKeyDown(Input.KEY_RIGHT))
            sl.heroi.setPosX(sl.heroi.getPosX() + 1);        

        if (timeCount  == timeInterval){ 
            sl.heroi.notificarTodos();                    
            sl.zumbi1.notificarTodos();
            sl.zumbi2.notificarTodos();
            sl.zumbi3.notificarTodos();
            timeCount =0;
        }     
        timeCount++;
    }
    
}
