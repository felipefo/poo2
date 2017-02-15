package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;

public class FabricaDeNotificacoes {
    String filePath;
    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) {        
        //gameover
        //ganhou   
        return null;
    }

   

}
