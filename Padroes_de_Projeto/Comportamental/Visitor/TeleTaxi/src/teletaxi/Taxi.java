
package teletaxi;

public abstract class Taxi implements Visitavel{
    
    private int velocidade=0;
        
    public void acceptVisitor(TaxiVisitor visitor){
        visitor.visit(this);        
    }
    
    public int getVelecidade(){
        return this.velocidade;
    }
    public abstract void parar();    
    public abstract void andarParaFrente();    
    public abstract void virarEsquerda();    
    public abstract void virarDireita();    
    public abstract void andarParaTras();    
    
}
