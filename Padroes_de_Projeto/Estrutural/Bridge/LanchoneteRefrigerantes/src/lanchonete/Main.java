
//referencia:
//https://inf.ufes.br/~vitorsouza/wp-content/uploads/teaching-br-padroesdeprojeto-exercicios02.pdf

package lanchonete;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CocaCola cocaCola = new CocaCola();
        Guarana guarana = new Guarana();
        TamanhoMedio tMedio = new TamanhoMedio(cocaCola);
        TamanhoMedio tMedio2 = new TamanhoMedio(guarana);
        TamanhoMedio tPequeno = new TamanhoMedio(guarana);
        tMedio.beber();
        tMedio2.beber();
        tPequeno.beber();
        
        
        
        
    }
    
}
