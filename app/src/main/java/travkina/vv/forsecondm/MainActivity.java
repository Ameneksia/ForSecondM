package travkina.vv.forsecondm;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity_main);
        Listaner1 listaner1 = new Listaner1();
        Listaner2 listaner2 = new Listaner2();
      //  Listaner3 listaner3 = new Listaner3();
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
       // Button button31 = (Button) findViewById(R.id.button31);
        button1.setOnClickListener(listaner1);
        button2.setOnClickListener(listaner2);
       // button2.setOnClickListener(listaner3);
    }


    class Listaner1 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            OpenFish(v);

        }
    }
    class Listaner2 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            OpenDraw(v);

        }
    }

    class Listaner3 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            OpenImages(v);

        }
    }



public void OpenFish (View view){
    Intent intent = new Intent(this, MainActivityFish.class);
    startActivity(intent);

}
    public void OpenDraw (View view){
        Intent intent = new Intent(this, IWantDraw.class);
        startActivity(intent);

    }
    public void OpenImages(View view){
        Intent intent = new Intent(this, Images.class);
        startActivity(intent);

    }

}