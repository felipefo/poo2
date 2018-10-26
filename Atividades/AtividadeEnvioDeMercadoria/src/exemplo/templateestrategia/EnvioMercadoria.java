package exemplo.templateestrategia;


public abstract class EnvioMercadoria implements IEnvio{            
    
    @Override
    public void enviar(){        
        calcularValor();    
        calcularPeso();    
        imprimirComprovante();        
        despachar();                
    }            
    public abstract double calcularValor();    
    public abstract double calcularPeso();    
    public abstract void imprimirComprovante();        
    public abstract void despachar();       
            
}
