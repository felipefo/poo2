package game.state.personagem;

import game.observer.PersonagemPadrao;

public class Pausado extends StatePersonagem {
    private int count = 0;
    private int x = -1;
    private  int y = -1;
    @Override
    public void doAction(PersonagemPadrao personagem) {
        if (x == -1) {
            this.x = personagem.getPosX();
            this.y = personagem.getPosY();
        }
        count++;
        if (count == 5000) {            
            //saindo do modo pausado.
            personagem.goNextState();
            count = 0;
        }
        personagem.getImage().draw(this.x, this.y);
    }
}
