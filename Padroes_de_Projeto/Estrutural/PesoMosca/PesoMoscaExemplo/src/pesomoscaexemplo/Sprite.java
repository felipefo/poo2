
package pesomoscaexemplo;


public class Sprite {
    protected Imagem imagem;
 
    public Sprite(String nomeDaImagem) {
        imagem = new Imagem(nomeDaImagem);
    }
     
    public void desenharImagem(int x, int y) {
        imagem.desenharImagem();
        System.out.println("No ponto (" + x + "," + y + ")!");
    }
    }