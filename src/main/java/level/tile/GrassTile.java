package level.tile;

import graphics.Screen;
import graphics.Sprite;

public class GrassTile extends Tile{

    public GrassTile(Sprite sprite) {
        super(sprite);
    }
    public void render(int x, int y, Screen screen){
        // render here
        screen.renderTile(x, y, this);

    }
}
