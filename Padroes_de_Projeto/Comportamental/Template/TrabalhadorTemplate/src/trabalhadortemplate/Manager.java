
package trabalhadortemplate;

import java.util.Calendar;


public class Manager extends Worker {
    @Override
    public void work() {
        System.out.println("Gerenciar projetos de software");
    }    
    public void relax(){
        if(Calendar.getInstance().getTime().getDay() == 1)
            System.out.println("Jogar bola");
        else 
            System.out.println("Assistir Tv");
    }    
}
