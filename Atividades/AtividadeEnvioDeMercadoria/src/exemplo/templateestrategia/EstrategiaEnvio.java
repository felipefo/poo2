
package exemplo.templateestrategia;


public class EstrategiaEnvio {    
    public IEnvio envio;    
    public EstrategiaEnvio(IEnvio envio){
        this.envio = envio;        
    }    
    public void processarEnvio(){
        this.iniciaProcessamento();
        this.envio.enviar();        
    }    
    private void iniciaProcessamento(){
        System.out.println("Registrar processamento de envio");
    }
    
    
}
