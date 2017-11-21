
package teletaxi;

public class Velocidade implements Visitavel {    
    private int velocidade = 0;
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }            

    @Override
    public void acceptVisitor(TransportVisitor visitor) {
        visitor.visit(this);
    }
}
