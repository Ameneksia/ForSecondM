package travkina.vv.forsecondm.figure;

import android.graphics.Canvas;
import android.graphics.RectF;
;

/**
 * Created by Анастасия on 07.12.2017.
 */

public class RoundRect extends Rect implements Touchable,Drawable{

    public float width= 50,height = 50;

    @Override
    public void touch(float x, float y) {
        this.x = x-80;
        this.y = y+120;
    }


    @Override
    public void draw(Canvas canvas) {
        RectF r = new RectF();
        r.set(69,25,43,15);
        canvas.drawRoundRect(r,width, width, p);
    }
}
