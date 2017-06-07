
package trabalhadortemplate;

public abstract class Worker {     
    public void dailyRoutive(){
        getUp();
        eatBrekfast();
        gotoWork();
        work();
        returnToHome();
        relax();
        sleep();
    }    
    public void getUp(){System.out.println("Levandar as 7:00");}    
    public void eatBrekfast(){System.out.println("Tomar cafe da manha");}    
    public void gotoWork(){System.out.println("Ir trabalhar");}
    public abstract void work();
    public void returnToHome(){System.out.println("Voltar para casa");}               
    public void relax(){System.out.println("Descansar");}               
    public void sleep(){System.out.println("Dormir");}                   
}
