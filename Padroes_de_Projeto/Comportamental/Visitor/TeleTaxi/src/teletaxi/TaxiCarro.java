
package teletaxi;

public class TaxiCarro extends Taxi {

    @Override
    public void parar() {  
       System.out.println("Apertar o freio");
    }

    @Override
    public void andarParaFrente() {        
        System.out.println("Acelerar");        
    }

    @Override
    public void virarEsquerda() {        
        System.out.println("Dar a seta");
        System.out.println("Virar voltante para direira");

    }

    @Override
    public void virarDireita() {
        System.out.println("Dar a seta");
        System.out.println("Virar voltante para direira");
    }

    @Override
    public void andarParaTras() {
        System.out.println("Acelerar contrario");        
    }
    
}
