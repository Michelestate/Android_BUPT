package com.bytedance.component.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final TextView textView3 = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView3.setText("What a wonderful world!");
                Log.d("MainActivity","button1.click!");
            }
        });

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        final TextView textView4 = findViewById(R.id.textView4);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView4.setText("Good Boy!");
                Log.d("MainActivity","button2.click!");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView4.setText("Good Girl!");
                Log.d("MainActivity","button3.click!");
            }
        });

        Log.d("MainActivity","running");
    }
}
