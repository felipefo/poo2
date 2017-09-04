
package iceadventure;

import java.util.HashMap;

public class AnimalFlyWeight {    
    private HashMap<String,Animal>  cacheAnimais = new HashMap<>();    
    public void addAnimal(Animal animal){        
        cacheAnimais.put(animal.getTipo(), animal);                        
    }    
    public AnimalFlyWeight(){          
        Bear bear  = new Bear();
        cacheAnimais.put(bear.getTipo(), bear);                        
        Pinguim pinguim  = new Pinguim();
        cacheAnimais.put(pinguim.getTipo(), pinguim);                                       
    }       
    public Animal getTipoAnimal(String tipo){
        return (Animal)cacheAnimais.get(tipo);        
    }
      
}
