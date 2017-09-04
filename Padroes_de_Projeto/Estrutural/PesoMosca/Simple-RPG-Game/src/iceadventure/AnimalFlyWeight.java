
package iceadventure;

import java.util.HashMap;

public class AnimalFlyWeight {    
    private HashMap<String,Animal>  cacheAnimais = new HashMap<>();
    
    public AnimalFlyWeight(){          
        Bear bear  = new Bear(0,0);
        cacheAnimais.put(bear.getTipo(), bear);                        
        Pinguim pinguim  = new Pinguim(0,0);
        cacheAnimais.put(pinguim.getTipo(), pinguim);           
        Fish fish  = new Fish(0,0);
        cacheAnimais.put(fish.getTipo(), fish);                        
    }   
    
    public Animal getTipoAnimal(String tipo){
        return (Animal)cacheAnimais.get(tipo);        
    }
      
}
