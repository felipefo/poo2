
package teletaxi;

public class TaxiMoto extends Taxi{

    public TaxiMoto(String name) {
        super(name);
    }

    @Override
    public void parar() {  
       System.out.println("Apertar o freio");
       this.velocidade.setVelocidade(0);
    }
    @Override
    public void andarParaFrente(int velocidade) {        
        System.out.println("Acelerar");        
        this.velocidade.setVelocidade(velocidade); }    
    @Override
    public void virarEsquerda(int velocidade) {        
        System.out.println("Dar a seta");
        System.out.println("Virar guidão para direira");
        this.velocidade.setVelocidade(velocidade); }   
    @Override
    public void virarDireita(int velocidade) {
        System.out.println("Dar a seta");
        System.out.println("Virar guidão para direira");
        this.velocidade.setVelocidade(velocidade); }   
    @Override
    public void andarParaTras(int velocidade) {
        System.out.println("Nada a fazer");        
        this.velocidade.setVelocidade(velocidade); }
    
}
