
package teletaxi;

import java.util.concurrent.ThreadLocalRandom;
//Classe que disponibiliza a posicao do gps do taxi
public class GPS {
    
    public int getLatitudeCorrente(){        
        return  ThreadLocalRandom.current().nextInt(0, 10);
    };
    
    public int getLongitudeCorrente(){        
        return  ThreadLocalRandom.current().nextInt(0, 10);
    };
    
}
