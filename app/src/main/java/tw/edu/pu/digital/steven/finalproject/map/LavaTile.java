package tw.edu.pu.digital.steven.finalproject.map;

import android.graphics.Canvas;
import android.graphics.Rect;

import tw.edu.pu.digital.steven.finalproject.graphics.Sprite;
import tw.edu.pu.digital.steven.finalproject.graphics.SpriteSheet;

class LavaTile extends Tile {
    private final Sprite sprite;

    public LavaTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getLavaSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}