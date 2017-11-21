
package teletaxi;

import java.util.ArrayList;


public class RegistrarGPS implements TaxiVisitor{

    private ArrayList<PosicaoGPS> posicaoGPS = new ArrayList();
            
    @Override
    public void visit(Taxi taxi) {                         

        //Implementem a visita ao taxi e tal forma que ele consiga armazenar 
        //as informcoes de posicao em posicaoGPS.
        
    }
    
    public ArrayList<PosicaoGPS> getPosicaoGPS(){
        return posicaoGPS;        
    }
    
}
