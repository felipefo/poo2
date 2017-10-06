
package chainofresponsability;

import java.util.List;
import javax.swing.JOptionPane;


public abstract class AbstractPagamentoHandler implements PagamentoHandler {

    private PagamentoHandler pagamentoHandler;
    @Override
    public void setNextHandler(PagamentoHandler handler) {
        this.pagamentoHandler = handler;
    }

    public void processHander(List lista, int valor) {
                
        if(lista.contains(getTipoPagamento()))
              valor = handlePagamento(valor);                               
        if (pagamentoHandler != null && valor >0)
            this.pagamentoHandler.processHander(lista, valor);
        
        
    }
    
    protected abstract int getTipoPagamento();
    
    protected int perguntaPagamento(String mensagem, int valor){
        String valorPagamento = JOptionPane.showInputDialog(mensagem);
        int valorRestante = valor - Integer.parseInt(valorPagamento);
        return valorRestante;
    }
    
    protected abstract int handlePagamento(int valor);
}
