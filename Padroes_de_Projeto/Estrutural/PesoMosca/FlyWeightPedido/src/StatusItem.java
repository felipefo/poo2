

/**
 *
 * @author felipe
 */
public class StatusItem {

    public enum Estado {CARRINHO, FECHADO, ENVIADO, ENTREGUE, PAGO};
    private Estado nome;
    private boolean podeCancelar;
    private boolean compraConcluida;

    public StatusItem(Estado nome, boolean podeCancelar, boolean compraConcluida){
        this.setNome(nome);
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;
    }

    public Estado getNome() {
        return nome;
    }

    public void setNome(Estado nome) {        
         this.nome = nome;                    
    }

    public boolean isPodeCancelar() {
        return podeCancelar;
    }
    public void setPodeCancelar(boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }

    public boolean isCompraConcluida() {
        return compraConcluida;
    }

    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }

}
