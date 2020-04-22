package testGame;

import engine.AbstractGame;
import engine.GameContainer;
import engine.Renderer;

public class GameManager extends AbstractGame {
    /**
     * GAME CONSTANTS =========================
     */
    private static final int width = 16*64;
    private static final int height = 16*32 + 15;
    private static final float scale = 1.5f;
    private static final double wantedFps = 9999;


    public GameManager() {
    }

    @Override
    public void update(GameContainer gc, float dTime) {

    }

    @Override
    public void render(GameContainer gc, Renderer renderer) {
    }

    public static void main(String[] args) {
        GameContainer gc = new GameContainer(new GameManager());
        gc.setWidth(width);
        gc.setHeight(height);
        gc.setScale(scale);
        gc.setFPS(wantedFps);
        gc.setFpsOffX(16*64 - 60);
        gc.setFpsOffY(16*32 + 2);
        gc.setDrawFPS(true);
        gc.start();
    }
}
