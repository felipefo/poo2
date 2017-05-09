
package game.observer;


public class Zumbi extends PersonagemPadrao implements Observador{
    
    public Zumbi(String pathImage, int posX, int posY) {
        super(pathImage, posX, posY);
    }
    @Override
    public void update(Observavel ob) {
        moveZumbi((Heroi) ob);
    }
    public void moveZumbi(Heroi heroi){
        float oposto = heroi.getPosX() - this.getPosX();       
        float adjacente = heroi.getPosY() - this.getPosY();        
        double hypo = Math.sqrt(Math.pow(oposto, 2) + Math.pow(adjacente, 2));
        float newPosX = (float) (this.getPosX() +  5 * (oposto/hypo));
        float newPosY = (float) (this.getPosY() + 5 * (adjacente/hypo));
        this.setPosX((int) newPosX);
        this.setPosY((int) newPosY );
    }
}
