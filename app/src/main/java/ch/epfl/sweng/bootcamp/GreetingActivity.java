package ch.epfl.sweng.bootcamp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GreetingActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle si){
        super.onCreate(si);
        setContentView(R.layout.atcivity_greeting);
        String msg = String.format("Hello %s!", getIntent().getStringExtra("user"));
        ((TextView)(findViewById(R.id.greetingMessage))).setText(msg);
    }
}
