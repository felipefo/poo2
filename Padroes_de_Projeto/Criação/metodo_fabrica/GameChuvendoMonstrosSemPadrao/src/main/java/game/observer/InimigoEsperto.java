
package game.observer;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author felipe
 */
public class InimigoEsperto extends PersonagemPadrao implements Observador {
     
    int xOriginal;
    int value=10;
  
    
    public InimigoEsperto(String pathImage, int posX, int posY) {
        super(pathImage, posX, posY);
    }
    @Override
    public void update(Observavel ob) {        
        
        if(posY == -20){
            this.xOriginal = this.posX;
        }
        if(this.posY >= 400){
            this.posY = -20;
            this.posX = ThreadLocalRandom.current().nextInt(0, 640);               
        }
        else{
            if(this.posX == this.xOriginal - 100 ){
                this.value = 5; 
            }else if (this.posX == this.xOriginal + 100 ) {                
                 this.value = -5;                 
            }
            this.posX = this.posX + value;
            this.posY += 5;
        }                        
    }
    
}
