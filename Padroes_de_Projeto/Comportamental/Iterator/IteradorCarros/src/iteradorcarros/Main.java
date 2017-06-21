
package iteradorcarros;

import iteradorcarros.modelo.Carro;
import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        List carros  = new ArrayList();
        carros.add(new Carro("uno"));
        carros.add(new Carro("palio"));
        carros.add(new Carro("corsa"));
        
        Iterador it = new VeiculoIterador(carros.toArray());
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
