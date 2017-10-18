
package game.state.personagem;

import game.observer.PersonagemPadrao;

public abstract class StatePersonagem {
    StatePersonagem nextState;

    public abstract void doAction(PersonagemPadrao personagem);                    
    public StatePersonagem getNextState() {
        return nextState;
    }
    public void setNextState(StatePersonagem nextState) {
        this.nextState = nextState;
    }
}
