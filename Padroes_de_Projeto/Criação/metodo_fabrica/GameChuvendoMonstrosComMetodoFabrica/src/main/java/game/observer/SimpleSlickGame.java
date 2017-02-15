package game.observer;

/**
 *
 * @author felipe
 */
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
    private Inimigo inimigo1;
    private Inimigo inimigo2;
    private Inimigo inimigo3;
    private Inimigo inimigoEsperto;
    private Image gameover;
    private Image ganhouJogo;
    FabricaDeInimigos fabricaDeInimigos;                       
    

    boolean ganhou=false;
    int time;
  
    Heroi heroi;

    public SimpleSlickGame(String gamename) {
        super(gamename);        
        fabricaDeInimigos =  new FabricaDeInimigos(); 
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
        try {
            File file = new File(".");
            String filePath = file.getCanonicalPath();
            
            

            land = new Image(filePath + "\\src\\main\\java\\bg.png");
            heroi = new Heroi(filePath + "\\src\\main\\java\\heroi1.png", 200, 400);
            
            
            inimigo1 = fabricaDeInimigos.criarInimigo(1);
            inimigo2 = fabricaDeInimigos.criarInimigo(2);
            inimigo3 = fabricaDeInimigos.criarInimigo(3);
            inimigoEsperto = fabricaDeInimigos.criarInimigo(4);
            
            
            gameover = new Image(filePath + "\\src\\main\\java\\gameover.png");
            ganhouJogo = new Image(filePath + "\\src\\main\\java\\ganhou.png");

            
            heroi.addMonitores(inimigo1);
            heroi.addMonitores(inimigo2);
            heroi.addMonitores(inimigo3);
            heroi.addMonitores(inimigoEsperto);

            ControleColisao controleColisao = new ControleColisao(gc);
            heroi.addMonitores(controleColisao);            
            inimigo1.addMonitores(controleColisao);
            inimigo2.addMonitores(controleColisao);
            inimigo3.addMonitores(controleColisao);
            inimigoEsperto.addMonitores(controleColisao);
            
        } catch (IOException ex) {
            Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        
       
        g.drawImage(land, 0, 0);
        g.drawString("Time : " + time/1000, 530, 20);
        heroi.render();
        inimigo2.render();
        inimigo3.render();
        inimigo1.render(); 
        inimigoEsperto.render();
       
        if(time/1000 >= 10){
            ganhouJogo.draw(200,200);
            gc.pause();
            ganhouJogo.draw(200,200);
            ganhou = true;
        }
        
        if(gc.isPaused() && ganhou == false)
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
         time += i;
         
                 
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_UP))
            this.heroi.setPosY(this.heroi.getPosY() - 2);        
        if (input.isKeyDown(Input.KEY_DOWN)) 
            this.heroi.setPosY(this.heroi.getPosY() + 2);        
        if (input.isKeyDown(Input.KEY_LEFT)) 
            this.heroi.setPosX(this.heroi.getPosX() - 2);        
        if (input.isKeyDown(Input.KEY_RIGHT))
            this.heroi.setPosX(this.heroi.getPosX() + 2);        
        timeCount++;
        if (timeCount == 50){ 
            heroi.noificarTodos();                    
            inimigo1.noificarTodos();
            inimigo2.noificarTodos();
            inimigo3.noificarTodos();
            inimigoEsperto.noificarTodos();
            timeCount=0;
            }
        }
        
    }
}
