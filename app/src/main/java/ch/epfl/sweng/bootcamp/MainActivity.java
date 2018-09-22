package ch.epfl.sweng.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.mainGoButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greet = new Intent(MainActivity.this,GreetingActivity.class);
                EditText name = (EditText)findViewById(R.id.mainName);
                greet.putExtra("user",name.getText().toString());
                startActivity(greet);
            }
        });
    }
}
