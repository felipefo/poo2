
package mementoexamplo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfiguracaoSOMemento {
    
    private ConfiguracaoSO config =null;
    private ConfiguracaoSO previusState=null;

    public ConfiguracaoSOMemento(ConfiguracaoSO config){        
           this.config  = config;
           setCurrentState();
    }    
    public ConfiguracaoSO restoreState(){        
        return previusState;
    }
   public void setCurrentState(){
        try {        
            this.previusState  = (ConfiguracaoSO) config.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ConfiguracaoSOMemento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
