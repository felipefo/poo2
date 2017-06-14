
package teletaxi;

import java.util.ArrayList;


public class RegistrarVelocidade implements TaxiVisitor{

    private ArrayList vecolidade = new ArrayList();
    
    @Override
    public void visit(Taxi taxi) {                     
        vecolidade.add(taxi.getVelecidade());
        System.out.println(taxi.getVelecidade());
    }
    
}
