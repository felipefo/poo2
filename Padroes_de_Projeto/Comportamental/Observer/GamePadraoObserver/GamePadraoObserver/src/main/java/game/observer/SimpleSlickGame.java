package game.observer;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import java.io.*;

public class SimpleSlickGame extends BasicGame {
    private int timeCount = 0;    
    private Image land;
    private Zumbi zumbi1;
    private Zumbi zumbi2;
    private Zumbi zumbi3;
    private Image gameover;
  
    Heroi heroi;

    public SimpleSlickGame(String gamename) {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
        try {
            File file = new File(".");
            String filePath = file.getCanonicalPath();
            
            land = new Image(filePath + "\\src\\main\\java\\bg.png");
            heroi = new Heroi(filePath + "\\src\\main\\java\\ator.png", 200, 200);
            zumbi1 = new Zumbi(filePath + "\\src\\main\\java\\zumbi.png", 500, 0);
            zumbi2 = new Zumbi( filePath + "\\src\\main\\java\\zumbi2.png", 0, 0);
            zumbi3 = new Zumbi(filePath + "\\src\\main\\java\\zumbi1.png", 400, 400);
            gameover = new Image(filePath + "\\src\\main\\java\\gameover.png");
            
            heroi.addMonitores(zumbi1);
            heroi.addMonitores(zumbi2);
            heroi.addMonitores(zumbi3);

            ControleColisao controleColisao = new ControleColisao(gc);
            heroi.addMonitores(controleColisao);            
            zumbi1.addMonitores(controleColisao);
            zumbi2.addMonitores(controleColisao);
            zumbi3.addMonitores(controleColisao);
            
        } catch (IOException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.drawImage(land, 0, 0);
        heroi.render();
        zumbi2.render();
        zumbi3.render();
        zumbi1.render();  
        
        if(gc.isPaused())
            gameover.draw(200,200);
                
        
    }

    public static void main(String[] args) {
        try {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);            
            appgc.start();
        } catch (SlickException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {        
        if(!gc.isPaused()){
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_UP))
            this.heroi.setPosY(this.heroi.getPosY() - 1);        
        if (input.isKeyDown(Input.KEY_DOWN)) 
            this.heroi.setPosY(this.heroi.getPosY() + 1);        
        if (input.isKeyDown(Input.KEY_LEFT)) 
            this.heroi.setPosX(this.heroi.getPosX() - 1);        
        if (input.isKeyDown(Input.KEY_RIGHT))
            this.heroi.setPosX(this.heroi.getPosX() + 1);        
        timeCount++;
        if (timeCount % 100 == 0){ 
            heroi.notificarTodos();                    
            zumbi1.notificarTodos();
            zumbi2.notificarTodos();
            zumbi3.notificarTodos();
        }
        }
    }
}
