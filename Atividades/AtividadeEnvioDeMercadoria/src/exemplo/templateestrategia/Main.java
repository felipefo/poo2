
package exemplo.templateestrategia;

public class Main {
        
      public static void main(String[] args) {       
          if(true){
            EstrategiaEnvio envio = new EstrategiaEnvio(new EnvioCorreio());          
            envio.processarEnvio();
          }else{
               EstrategiaEnvio envio = new EstrategiaEnvio(new EnvioCorreioExpresso());          
               envio.processarEnvio();
          }       
    }
      
      
      
}
