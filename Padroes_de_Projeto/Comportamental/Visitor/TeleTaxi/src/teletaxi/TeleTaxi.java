
package teletaxi;

import java.util.ArrayList;


public class TeleTaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistrarVelocidade registrarVelocidade = new RegistrarVelocidade();
        TaxiCarro taxiCarro = new TaxiCarro();
        taxiCarro.acceptVisitor(registrarVelocidade);
        
        ArrayList<String> comandos = new ArrayList();
        comandos.add("Frente");
        comandos.add("Direita");
        comandos.add("Frente");
        comandos.add("Esquerda");                
        MotoristaAutonomo motorista = new MotoristaAutonomo(comandos);
        taxiCarro.acceptVisitor(motorista);        
        taxiCarro.acceptVisitor(registrarVelocidade);
               
        TaxiMoto taxiMoto = new TaxiMoto();
        taxiMoto.acceptVisitor(motorista);        
        taxiMoto.acceptVisitor(registrarVelocidade);
                
        
        
    }
    
}
