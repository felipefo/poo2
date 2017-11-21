
package teletaxi;

public abstract class Taxi implements Visitavel{
    
    protected Velocidade velocidade= new Velocidade();    
    private GPS gps = new GPS();    
    private String name="";    
    
    
    public Taxi(String name ){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void acceptVisitor(TransportVisitor visitor){
        velocidade.acceptVisitor(visitor);
        gps.acceptVisitor(visitor);                
        visitor.visit(this);
    }    
    
    public abstract void parar();    
    public abstract void andarParaFrente(int velocidade);    
    public abstract void virarEsquerda(int velocidade);    
    public abstract void virarDireita(int velocidade);    
    public abstract void andarParaTras(int velocidade);    
    
}
