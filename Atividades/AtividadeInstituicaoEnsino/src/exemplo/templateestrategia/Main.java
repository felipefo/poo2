
package exemplo.templateestrategia;

public class Main {
        
      public static void main(String[] args) {       
          if(true){
            EstrategiaMatricula matricula = new EstrategiaMatricula(new GraducaoInformatica());          
            matricula.processarMatricula();
          }else{
               EstrategiaMatricula matricula = new EstrategiaMatricula(new TecnicoInformatica());          
               matricula.processarMatricula();
          }       
    }                  
}
