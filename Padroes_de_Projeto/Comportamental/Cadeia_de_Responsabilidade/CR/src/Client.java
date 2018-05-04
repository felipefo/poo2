
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args){
                
        AbstractPagamentotHandler cartao = new CartaoPagamentoHandler();
        AbstractPagamentotHandler boleto = new BoletoPagamentoHandler();
        AbstractPagamentotHandler dinheiro = new DinheiroPagamentoHandler();
        AbstractPagamentotHandler cheque = new ChequePagamentoHandler();
        
        cartao.setProximaOpcao(boleto);
        boleto.setProximaOpcao(dinheiro);
        dinheiro.setProximaOpcao(cheque);
        
        List<AbstractPagamentotHandler.Pagamento> opcoesDePagamento = new LinkedList<>();
        
        opcoesDePagamento.add(AbstractPagamentotHandler.Pagamento.DINHEIRO);
        opcoesDePagamento.add(AbstractPagamentotHandler.Pagamento.CARTAO);
        //passando um lista de opcoes de pagamento para a cadeia
        //de responsabilidade
        cartao.buscaOpcaoDePagamento(opcoesDePagamento);
    }
}
