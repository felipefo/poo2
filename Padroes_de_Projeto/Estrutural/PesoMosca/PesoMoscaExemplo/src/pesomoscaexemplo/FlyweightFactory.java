
package pesomoscaexemplo;
import java.util.ArrayList;
public class FlyweightFactory {
    protected ArrayList<Sprite> flyweights;
    public enum Sprites {
        JOGADOR, INIMIGO_1, INIMIGO_2, CENARIO_1
    }
    public FlyweightFactory() {
        flyweights = new ArrayList<Sprite>();        
        flyweights.add(new Sprite("jogador.png"));
        flyweights.add(new Sprite("inimigo1.png"));
        flyweights.add(new Sprite("inimigo2.png"));
        flyweights.add(new Sprite("cenario1.png"));
    }
    public Sprite getFlyweight(Sprites jogador) {
        switch (jogador) {
        case JOGADOR:
            return flyweights.get(0);
        case INIMIGO_1:
            return flyweights.get(1);
        case INIMIGO_2:
            return flyweights.get(2);
        default:
            return flyweights.get(3);
        }
    }
    }
  
