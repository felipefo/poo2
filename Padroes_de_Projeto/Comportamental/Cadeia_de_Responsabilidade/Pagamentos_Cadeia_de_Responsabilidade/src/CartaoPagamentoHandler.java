

public class CartaoPagamentoHandler extends AbstractPagamentotHandler{

    public CartaoPagamentoHandler() {
        super(Pagamento.CARTAO);
    }
    
    @Override
    public void write(String message) {
        System.out.println(message);
        System.out.println("Pagamento recebido.\nForma: Cartão.\n");
    }
}
