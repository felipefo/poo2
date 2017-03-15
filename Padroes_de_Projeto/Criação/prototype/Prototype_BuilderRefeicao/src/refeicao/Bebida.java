/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeicao;

import java.io.Serializable;

/**
 *
 * @author felip
 */
public class  Bebida  implements Cloneable, Serializable{
    
    private String sabor;
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }            
    
    
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


