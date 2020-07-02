package com.ocanseygodfred.question3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button=(Button)findViewById(R.id.button);
    textView=(TextView)findViewById(R.id.textView);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            counter= counter+1;

            textView.setText(String.valueOf(counter));

        }
    });

    }
}
