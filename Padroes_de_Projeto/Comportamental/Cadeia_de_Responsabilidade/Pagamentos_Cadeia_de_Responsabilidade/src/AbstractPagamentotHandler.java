


import java.util.List;


public abstract class AbstractPagamentotHandler {    
    public Pagamento tipoPagamento;
    public List<Integer> opcoesDePagamento;
    public AbstractPagamentotHandler proximaOpcao;    
    public enum Pagamento { CARTAO, CHEQUE, DINHEIRO, BOLETO }
    public AbstractPagamentotHandler(Pagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public void setProximaOpcao(AbstractPagamentotHandler proximaOpcao) {
        this.proximaOpcao = proximaOpcao;
    }        
    public void buscaOpcaoDePagamento(List<Pagamento> opcoesDePagamento){
        for (Pagamento opcao : opcoesDePagamento) {
            pagamentoHandler(opcao);}
    }    
    private void pagamentoHandler(Pagamento opcao){
        if (tipoPagamento == opcao) {
            write("Opção escolhida:");}
        else {proximaOpcao.pagamentoHandler(opcao);}        
    }    
    public abstract void write(String message);
}
