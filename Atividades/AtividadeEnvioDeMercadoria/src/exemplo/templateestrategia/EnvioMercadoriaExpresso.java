
package exemplo.templateestrategia;

public abstract class EnvioMercadoriaExpresso implements IEnvio{
    
     @Override
    public void enviar(){                   
        calcularPeso();  
        //removido o passo de imprimirComprovante(); 
        despachar();                
    }                
    public abstract double calcularPeso();       
    public abstract void despachar();  
    
}
