
package game.state.jogo;

import game.observer.SimpleSlickGame;
import org.newdawn.slick.GameContainer;


public abstract class State {
     
    State nextState;
   
    public abstract void doAction(GameContainer gc,SimpleSlickGame sl,int i);                    
    
    public State getNextState() {
        return this.nextState;
    }

    public void setNextState(State state) {
        this.nextState = state;
    }
   
}
