
package game.state;


public class SetupGame {    
   
    State gameOver  = new GameOver();
    State jogarHard = new JogarHard();
    State jogar = new Jogar();
    State currentState;    
    
    public SetupGame(){        
    }    
    public void setupEstadoInicial(int level){                
        jogarHard.setNextState(gameOver);       
        jogar.setNextState(gameOver);                              
        if(level == 1)
          this.currentState  = jogarHard;                
        else
          this.currentState  = jogar;        
    }    
    public State getState(){
        return this.currentState;
    }    
    
    public void setNextState(){
        this.currentState = this.currentState.getNextState();
    }
    
}
