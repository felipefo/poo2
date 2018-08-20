
package refeicao;

import java.io.Serializable;


public class Refeicao implements Cloneable, Serializable{    
    private Hamburguer hamburguer;
    private Bebida bebida;
    public Hamburguer getHamburger() {
        return hamburguer;
    }    
    public void setHamburger(Hamburguer hamburger) {
        this.hamburguer = hamburger;
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
            obj.setHamburger((Hamburguer) hamburguer.clone());
            
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
        

    
    
}
