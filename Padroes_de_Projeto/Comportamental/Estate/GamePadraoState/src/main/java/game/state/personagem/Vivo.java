

package game.state.personagem;

import game.observer.PersonagemPadrao;


public class Vivo extends StatePersonagem {

    @Override
    public void doAction(PersonagemPadrao personagem) {
       
        personagem.getImage().draw(personagem.getPosX(), personagem.getPosY());
    }
    
}
