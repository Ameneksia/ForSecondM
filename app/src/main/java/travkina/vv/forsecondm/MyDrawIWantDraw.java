package travkina.vv.forsecondm;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

import travkina.vv.forsecondm.figure.Circle;
import travkina.vv.forsecondm.figure.Drawable;
import travkina.vv.forsecondm.figure.Touchable;

/**
 * Created by Анастасия on 07.12.2017.
 */

public class MyDrawIWantDraw extends View {

    ArrayList objects = new ArrayList();

    public MyDrawIWantDraw(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        for(Object obj: objects){
            if(obj instanceof Drawable)
                ((Drawable) obj).draw(canvas);
        }

        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        for(Object obj: objects) {
            if (obj instanceof Touchable)
                ((Touchable) obj).touch(event.getX(), event.getY());
        }

        //CRocket.setTarget(event.getX(),event.getY());
        return super.onTouchEvent(event);
    }


}
