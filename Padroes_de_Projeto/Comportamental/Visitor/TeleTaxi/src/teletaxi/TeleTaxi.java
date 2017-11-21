
package teletaxi;

import java.util.ArrayList;


public class TeleTaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        TaxiCarro taxiCarro = new TaxiCarro("t1");        
        TaxiMonitor monitor = new TaxiMonitor();        
        taxiCarro.virarDireita(10);
        //taxiCarro.getGPS()?? isso não funciona, PQ?
        taxiCarro.acceptVisitor(monitor);                        
        taxiCarro.andarParaFrente(60);                
        taxiCarro.acceptVisitor(monitor);                
    }
    
}
