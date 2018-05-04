
public class ChequePagamentoHandler extends AbstractPagamentotHandler{

    public ChequePagamentoHandler() {
        super(Pagamento.CHEQUE);
    }
    
    @Override
    public void write(String message) {
        System.out.println(message);
        System.out.println("Pagamento recebido.\nForma: Cheque.\n");
    }
}
