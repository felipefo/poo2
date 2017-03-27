package pesomoscaexemplo;


public class Imagem {
    protected String nomedaImagem;
 
    public Imagem(String imagem) {
        nomedaImagem = imagem;
    }
 
    public void desenharImagem() {
      System.out.println(nomedaImagem + " desenhada!");      
    }
    }