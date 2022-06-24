package tw.edu.pu.digital.steven.finalproject.map;

import android.graphics.Canvas;
import android.graphics.Rect;

import tw.edu.pu.digital.steven.finalproject.graphics.Sprite;
import tw.edu.pu.digital.steven.finalproject.graphics.SpriteSheet;

class WaterTile extends Tile {
    private final Sprite sprite;

    public WaterTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getWaterSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
