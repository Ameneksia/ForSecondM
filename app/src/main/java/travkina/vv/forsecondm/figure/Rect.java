package travkina.vv.forsecondm.figure;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Анастасия on 07.12.2017.
 */

public class Rect extends Figure implements Touchable,Drawable {

   public float a = 70, b = 120;

    Paint p = new Paint();


    @Override
    public void touch(float x, float y) {
        this.x = x+80;
        this.y = y-120;
    }

    @Override
    public void draw(Canvas canvas) {
       // p.setColor(139);
        canvas.drawRect(x,y,x+b,y+a,p);
    }
}
