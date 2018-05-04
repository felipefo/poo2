
public class DinheiroPagamentoHandler extends AbstractPagamentotHandler{

    public DinheiroPagamentoHandler() {
        super(Pagamento.DINHEIRO);
    }
    
    @Override
    public void write(String message) {
        System.out.println(message);
        System.out.println("Pagamento recebido.\nForma: Dinheiro.\n");
    }
}
