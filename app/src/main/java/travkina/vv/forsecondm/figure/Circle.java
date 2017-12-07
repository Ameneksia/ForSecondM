package travkina.vv.forsecondm.figure;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Анастасия on 07.12.2017.
 */

public class Circle extends Figure implements Touchable,Drawable{

    float r=10;
    Paint p = new Paint();

    @Override
    public void touch(float x, float y) {
           this.x = x;
           this.y = y;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(x,y,r,p);
    }
}
