package iceadventure;

import java.awt.Font;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState {

    private static final int NUMBEROFCHOICES = 4;
    private static final int CONTINUE = 0;
    private static final int SAVE = 1;
    private static final int LOAD = 2;
    private static final int QUIT = 3;
    private String[] playersOptions = new String[NUMBEROFCHOICES];
    private Font menuFont, creditsFont;
    private TrueTypeFont playersOptionsTTF, creditsTTF;
    private int playersChoice, stateid;
    private Color notChosen = new Color(153, 204, 255);
    private FileIO fileio = new FileIO();
    private Vector2f heropos = new Vector2f(0, 0);
    private static final String[] credits = {"Credits", "Code and TiledMap: Miikka Merikanto, miikka.merikanto@businesscollege.fi", "Hero's images (CC3.0): cjc83486 from opengameart.com, http://opengameart.org/users/cjc83486", "CC3.0 reserved"};

    public MenuState(int id) {
        stateid = id;
    }

    @Override
    public int getID() {
        return stateid;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        menuFont = new Font("Verdana", Font.BOLD, 40);
        creditsFont = new Font("Verdana", Font.PLAIN, 16);
        playersOptionsTTF = new TrueTypeFont(menuFont, true);
        creditsTTF = new TrueTypeFont(creditsFont, true);
        playersOptions[0] = "Continue";
        playersOptions[1] = "Save";
        playersOptions[2] = "Load";
        playersOptions[3] = "Credits";
        playersOptions[3] = "Quit";
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_DOWN)) {
            if (playersChoice == (NUMBEROFCHOICES - 1)) {
                playersChoice = 0;
            } else {
                playersChoice++;
            }
        }
        if (input.isKeyPressed(Input.KEY_UP)) {
            if (playersChoice == 0) {
                playersChoice = NUMBEROFCHOICES - 1;
            } else {
                playersChoice--;
            }
        }
        if (input.isKeyPressed(Input.KEY_ENTER)) {
            switch (playersChoice) {
                case CONTINUE:
                    sbg.enterState(IceAdventure.GAMEPLAYSTATE);
                    break;
                case SAVE:
                    heropos = ((GamePlayState) sbg.getState(IceAdventure.GAMEPLAYSTATE)).getHeroPosition();
                    fileio.save(heropos);
                    sbg.enterState(IceAdventure.GAMEPLAYSTATE);
                    break;
                case LOAD:
                    heropos = fileio.loadSave();
                    ((GamePlayState) sbg.getState(IceAdventure.GAMEPLAYSTATE)).setHeroPosition(heropos);
                    sbg.enterState(IceAdventure.GAMEPLAYSTATE);
                    break;
                case QUIT:
                    gc.exit();
                    break;
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        renderPlayersOptions();
        renderCredits();
    }

    private void renderPlayersOptions() {
        for (int i = 0; i < NUMBEROFCHOICES; i++) {
            if (playersChoice == i) {
                playersOptionsTTF.drawString(100, i * 50 + 200, playersOptions[i]);
            } else {
                playersOptionsTTF.drawString(100, i * 50 + 200, playersOptions[i], notChosen);
            }
        }
    }

    private void renderCredits() {
        for (int i = 0; i < credits.length; i++) {
            creditsTTF.drawString(100, i * 20 + 640, credits[i]);
        }
    }
}