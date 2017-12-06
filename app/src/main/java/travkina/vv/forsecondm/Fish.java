package travkina.vv.forsecondm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by Анастасия on 04.12.2017.
 */

public class Fish {

    float x, y, vx, vy;
    boolean n;
    Bitmap pic;

    Fish(Bitmap pic){

        this.x = 800;
        this.y = (float) (Math.random()*501+500 );
        this.vx = 5;
        this.vy = 0;
        this.n = true;
        this.pic = pic;
    }
    void move(){
        if(x==30) n = false;
        else if(x==800) n = true;

if(x<=800 && x>1 && n==true) {
            this.x -= this.vx;
            this.y -= this.vy;
        }
        else if(x<=800 && x>=1 && n==false){
    this.x += this.vx;
    this.y += this.vy;
}


    }



    Paint paint = new Paint();
    Matrix matrix = new Matrix();
    void draw(Canvas canvas){
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
      //  matrix.postTranslate(-pic.getWidth()/10,-pic.getHeight()/10);
      //  matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }

}
