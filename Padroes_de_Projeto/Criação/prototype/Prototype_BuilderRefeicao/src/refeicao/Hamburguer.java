

package refeicao;

import java.io.Serializable;


public class Hamburguer implements Cloneable, Serializable {
    
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
            
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
    
}
