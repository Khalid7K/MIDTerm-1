package com.example.khalid_mid21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView play11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play11=(ImageView)findViewById(R.id.imageView2);
        play11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });
        Button bttn1 = (Button)findViewById(R.id.button);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct2.class));

            }
        });
        Button bttn2 = (Button)findViewById(R.id.button2);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct3.class));

            }
        });
        Button bttn3 = (Button)findViewById(R.id.button3);
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct1.class));

            }
        });
        Button bttn4 = (Button)findViewById(R.id.button4);
        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct3.class));
            }
        });
        Button bttn5 = (Button)findViewById(R.id.button5);
        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct1.class));
            }
        });
        Button bttn6 = (Button)findViewById(R.id.button6);
        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct2.class));
            }
        });
        }

    }
}