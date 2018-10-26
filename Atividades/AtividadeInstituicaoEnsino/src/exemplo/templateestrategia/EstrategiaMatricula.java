
package exemplo.templateestrategia;


public class EstrategiaMatricula {    
    
    public IProcessaMatricula matricula;    
    public EstrategiaMatricula(IProcessaMatricula matricula){
        this.matricula = matricula;        
    }    
    public void processarMatricula(){
        this.iniciaProcessamento();
        this.matricula.processar();        
    }    
    private void iniciaProcessamento(){
        System.out.println("Registrar processamento da matricula");
    }    
    
}
