

public class BoletoPagamentoHandler extends AbstractPagamentotHandler{

    public BoletoPagamentoHandler() {
        super(Pagamento.BOLETO);
    }    
    @Override
    public void write(String message) {
        System.out.println(message);
        System.out.println("Pagamento recebido.\nForma: Boleto.\n");
    }
}
