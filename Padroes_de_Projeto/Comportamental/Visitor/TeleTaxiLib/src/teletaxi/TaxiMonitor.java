
package teletaxi;

import java.util.ArrayList;


public class TaxiMonitor implements TransportVisitor {

    private ArrayList<Integer> velocidade = new ArrayList();
    @Override
    public void visit(GPS gps) {
        //TODO
    }
    @Override
    public void visit(Velocidade velocidade) {        
        int veloc = velocidade.getVelocidade();        
        this.velocidade.add(veloc); 
    }
    @Override
    public void visit(Taxi taxi) {   
        System.out.println("Nome=" + taxi.getName());        
        //TODO: assim como a velocidade exiba as varias posicoes de gps.        
        for(Integer velo : this.velocidade){
            System.out.println("Velocidade:" + velo +  "\n");
        }        
    }

    @Override
    public void visit(Motor motor) {        
        System.out.println("nivel agua:" + motor.getNivelAgua() +  "\n");
        System.out.println("potencia:" + motor.getPotencia()  +  "\n");
        System.out.println("pressao oleo:" + motor.getPressaoOleo()  +  "\n");
    }
}
