package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;

public class FabricaDeInimigos {
    String filePath;
    FabricaDeInimigos() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeInimigos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    public Inimigo criarInimigo(int tipoInimigo) {
        Inimigo inimigo = null;
        if (tipoInimigo == 1) {
            inimigo = new Inimigo(filePath + "\\src\\main\\java\\devil1.png", 500, -100);
        } else if (tipoInimigo == 2) {
            inimigo = new Inimigo(filePath + "\\src\\main\\java\\devil2.png", 300, -00);
        } else if (tipoInimigo == 3) {
            inimigo = new Inimigo(filePath + "\\src\\main\\java\\devil3.png", 400, -250);
        }
        else if (tipoInimigo == 4) {
          inimigo = new InimigoEsperto(filePath + "\\src\\main\\java\\devil3.png", 200, -250);
        }
        return inimigo;
    }

   

}
