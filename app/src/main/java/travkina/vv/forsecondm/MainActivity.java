package travkina.vv.forsecondm;

import android.content.Intent;
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
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(listaner1);
    }


    class Listaner1 implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            OpenFish(v);

        }
    }
public void OpenFish (View view){
    Intent intent = new Intent(this, MainActivityFish.class);
    startActivity(intent);


}


}