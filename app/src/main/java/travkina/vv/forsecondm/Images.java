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
        Listaner13 listaner13 = new Listaner13();
        Listaner23 listaner23 = new Listaner23();
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(listaner13);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(listaner23);
    }

    class Listaner13 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.fish);
        }
    }

    class Listaner23 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.fish2);
        }
    }
}
