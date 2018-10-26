package exemplo.templateestrategia;


public class EnvioCorreio extends EnvioMercadoria {

    @Override
    public double calcularValor() {
        return 0.0;
    }

    @Override
    public double calcularPeso() {
      return 0.0;
    }

    @Override
    public void imprimirComprovante() {
      
    }

    @Override
    public void despachar() {
     
    }
    
    
}
