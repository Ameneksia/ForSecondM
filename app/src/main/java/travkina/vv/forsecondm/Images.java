package travkina.vv.forsecondm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        Listaner4 listaner4 = new Listaner4();
        Listaner5 listaner5 = new Listaner5();
        Button button1 = (Button) findViewById(R.id.button_fish1);
        button1.setOnClickListener(listaner4);
        Button button2 = (Button) findViewById(R.id.button_fish2);
        button2.setOnClickListener(listaner5);
    }

    class Listaner4 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.pigeon1);
        }
    }

    class Listaner5 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.kol);
        }
    }
}
