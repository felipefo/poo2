
package refeicao;

import java.io.Serializable;

/**
 *
 * @author felipe
 */
public class Refeicao implements Cloneable, Serializable{    
    private Hamburger hamburger;
    private Bebida bebida;
    public Hamburger getHamburger() {
        return hamburger;
    }    
    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }    
    public Bebida getBebida() {
        return bebida;
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }           
    public Object clone(){
        Refeicao obj = null;
        try{            
            obj = (Refeicao)super.clone();
            obj.setBebida((Bebida) bebida.clone());
            obj.setHamburger((Hamburger) hamburger.clone());
            
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
        

    
    
}
