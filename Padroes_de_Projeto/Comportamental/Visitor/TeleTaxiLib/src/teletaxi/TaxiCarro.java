
package teletaxi;
public class TaxiCarro extends Taxi {

    public TaxiCarro(String name) {
        super(name);
    }
    @Override
    public void parar(){
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
        System.out.println("Virar voltante para direira");
        this.velocidade.setVelocidade(velocidade); }
    @Override
    public void virarDireita(int velocidade) {
        System.out.println("Dar a seta");
        System.out.println("Virar voltante para direira");
        this.velocidade.setVelocidade(velocidade); }
    @Override
    public void andarParaTras(int velocidade) {
        System.out.println("Acelerar contrario");  
        this.velocidade.setVelocidade(velocidade); 
    }   
}
