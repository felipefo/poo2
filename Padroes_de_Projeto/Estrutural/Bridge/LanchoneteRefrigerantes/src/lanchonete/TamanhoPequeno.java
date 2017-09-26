//referencia:
//https://inf.ufes.br/~vitorsouza/wp-content/uploads/teaching-br-padroesdeprojeto-exercicios02.pdf
package lanchonete;

public class TamanhoPequeno extends AbstracaoTamanho {

    public TamanhoPequeno(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }

    public void beber() {
          System.out.println("Toma um gole  de " + refrigerante );
          System.out.println("Acabou  o(a)  " + refrigerante);
          System.out.println();
    }
}
