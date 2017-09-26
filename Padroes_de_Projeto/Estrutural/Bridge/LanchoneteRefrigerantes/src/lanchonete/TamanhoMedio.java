package lanchonete;


public class TamanhoMedio extends AbstracaoTamanho {

    public TamanhoMedio(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }
    public void beber()
    {
       System.out.println( "Toma um gole  de " + refrigerante); 
       System.out.println( "Toma outro gole  de " + refrigerante); 
       System.out.println( "Acabou  o(a)  " + refrigerante); 
       System.out.println();
    }
}
