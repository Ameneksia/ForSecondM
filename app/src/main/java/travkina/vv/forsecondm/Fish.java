package travkina.vv.forsecondm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by Анастасия on 04.12.2017.
 */

public class Fish {

   private float x, y, vx, vy;
   private boolean n;
    Bitmap pic;

    public boolean isN() {
        return n;
    }

    public void setN(boolean n) {
        this.n = n;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

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
        matrix.postTranslate(-pic.getWidth()/10,-pic.getHeight()/10);
        //matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }

}
