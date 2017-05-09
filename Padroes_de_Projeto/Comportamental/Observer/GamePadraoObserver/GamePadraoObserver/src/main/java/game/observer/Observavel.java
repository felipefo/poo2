
package game.observer;
import java.util.ArrayList;
import java.util.List;

public class Observavel  {

    List<Observador> observadores = new ArrayList();        
    public List<Observador> getMonitores() {
        return observadores;
    }
    public void addMonitores(Observador monitores) {
        this.observadores.add(monitores);
    }
    public void notificarTodos(){
        for(Observador ob : observadores ){
            ob.update(this);
        }
    }   
}
