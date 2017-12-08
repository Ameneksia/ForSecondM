package travkina.vv.forsecondm;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

import travkina.vv.forsecondm.figure.Circle;
import travkina.vv.forsecondm.figure.Cube;
import travkina.vv.forsecondm.figure.Drawable;
import travkina.vv.forsecondm.figure.Rect;
import travkina.vv.forsecondm.figure.RoundRect;
import travkina.vv.forsecondm.figure.Touchable;

/**
 * Created by Анастасия on 07.12.2017.
 */

public class MyDrawIWantDraw extends View {

    //ArrayList objects = new ArrayList();
    Circle circle = new Circle();
    Rect rect = new Rect();
    RoundRect roundRect = new RoundRect();
    Cube cube = new Cube();


    public MyDrawIWantDraw(Context context, AttributeSet attrs) {
        super(context, attrs);


    }




    @Override
    protected void onDraw(Canvas canvas) {

        circle.draw(canvas);
        rect.draw(canvas);
        cube.draw(canvas);
        roundRect.draw(canvas);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


       circle.touch(event.getX(), event.getY());
       rect.touch(event.getX(), event.getY());
       roundRect.touch(event.getX(), event.getY());
        cube.touch(event.getX(), event.getY());
        return super.onTouchEvent(event);
    }


}
