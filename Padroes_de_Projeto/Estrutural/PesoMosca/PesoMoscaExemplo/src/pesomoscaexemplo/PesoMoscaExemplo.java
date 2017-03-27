
package pesomoscaexemplo;

import pesomoscaexemplo.FlyweightFactory.Sprites;

public class PesoMoscaExemplo {

    public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory(); 
    factory.getFlyweight(Sprites.JOGADOR).desenharImagem(5,5); 
    factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(10,10);
    factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(20,20);            
    factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(30,10);            
    factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(40,40);            
    factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(20,35);            
    }    
    
}
