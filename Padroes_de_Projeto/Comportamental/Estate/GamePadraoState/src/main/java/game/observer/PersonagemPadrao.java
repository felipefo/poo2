/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.observer;

import game.state.personagem.Pausado;
import game.state.personagem.StatePersonagem;
import game.state.personagem.Vivo;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author felipe
 */
public class PersonagemPadrao extends Observavel {    
    Image image;
    int posX;
    int posY;
    private StatePersonagem currentState;
    private StatePersonagem vivo = new Vivo();
    private StatePersonagem pausado = new Pausado();
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PersonagemPadrao(String pathImage, int posX, int posY){        
        this.posX = posX;
        this.posY = posY;
        try {
            image = new Image(pathImage);
        } catch (SlickException ex) {
            Logger.getLogger(PersonagemPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        vivo.setNextState(pausado);
        pausado.setNextState(vivo);                
        setCurrentState( vivo );
    }
       
    public void setCurrentState(StatePersonagem state){
        this.currentState  = state;
    }
    
     public StatePersonagem getCurrentState(){
        return this.currentState;
    }
    
     public void goNextState(){
        this.currentState = this.currentState.getNextState();
    }    
   
    public Image getImage(){        
        return this.image;
    }
    public void render(){        
       if(this.currentState!=null){
            this.currentState.doAction(this);        
       }
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
}
