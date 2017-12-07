package travkina.vv.forsecondm;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import static android.R.attr.numStars;

/**
 * Created by Анастасия on 04.12.2017.
 */

public class MyDrawFish extends View {


    public MyDrawFish(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.fish1  = new Fish(BitmapFactory.decodeResource(getResources(), R.drawable.fish1));

    }



    Fish fish1;

    @Override
    protected void onDraw(Canvas canvas) {

        fish1.draw(canvas);
        fish1.move();



        invalidate();
    }






    }
