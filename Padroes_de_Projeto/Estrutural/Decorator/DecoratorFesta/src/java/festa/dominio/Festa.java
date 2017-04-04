/*

 */
package festa.dominio;

/**
 *
 * @author felipe
 */
public abstract class Festa {
   
    
    String description = "Festa Desconhecida";
          
    
    public String getDescription() {
        return description;
    }
     
     public Festa() {              
    }

    public abstract double cost();
}
