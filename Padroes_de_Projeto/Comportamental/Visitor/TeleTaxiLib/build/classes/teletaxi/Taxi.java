
package teletaxi;

public abstract class Taxi implements Visitavel{
    
    private int velocidade=0;
    
    private GPS gps = new GPS();
            
    private int lat =0;
    private int log =0;
        
    public void acceptVisitor(TaxiVisitor visitor){
        visitor.visit(this);        
    }
    
    public int getLat(){
        return this.gps.getLatitudeCorrente();
    }
    
    public int getLog(){
        return this.gps.getLongitudeCorrente();
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
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
