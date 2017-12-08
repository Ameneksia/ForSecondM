package travkina.vv.forsecondm.figure;

import android.graphics.Canvas;

/**
 * Created by Анастасия on 08.12.2017.
 */

public class Cube extends Rect implements Touchable,Drawable{


    @Override
    public void touch(float x, float y) {
        this.x = x-80;
        this.y = y+120;
    }

    @Override
    public void draw(Canvas canvas) {
        // p.setColor(139);
        canvas.drawRect(x,y,x+b,y+b,p);
    }
}
