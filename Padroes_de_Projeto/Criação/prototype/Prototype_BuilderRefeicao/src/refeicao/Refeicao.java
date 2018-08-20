
package refeicao;

import java.io.Serializable;


public class Refeicao implements Cloneable, Serializable{    
    private Hamburguer hamburguer;
    private Bebida bebida;
    public Hamburguer getHamburguer() {
        return hamburguer;
    }    
    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
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
            obj.setHamburguer((Hamburguer) hamburguer.clone());
            
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
        

    
    
}
