package tw.edu.pu.digital.steven.finalproject.map;

import android.graphics.Canvas;
import android.graphics.Rect;

import tw.edu.pu.digital.steven.finalproject.graphics.Sprite;
import tw.edu.pu.digital.steven.finalproject.graphics.SpriteSheet;

class GrassTile extends Tile {
    private final Sprite sprite;

    public GrassTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getGrassSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}