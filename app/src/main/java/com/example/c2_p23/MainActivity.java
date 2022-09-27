package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int lightNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click = findViewById(R.id.click);
        View trafficLight = findViewById(R.id.trafficLight);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lightNumber == 0) {
                    trafficLight.setBackgroundColor(Color.parseColor("#ff0000"));
                    lightNumber = 1;
                } else if (lightNumber == 1) {
                    trafficLight.setBackgroundColor(Color.parseColor("#ffff00"));
                    lightNumber = 2;
                } else if (lightNumber == 2) {
                    trafficLight.setBackgroundColor(Color.parseColor("#00FF00"));
                    lightNumber = 3;
                } else if (lightNumber == 3){
                    trafficLight.setBackgroundColor(Color.parseColor("#ffff00"));
                    lightNumber = 0;
                } else {

                }
            }

        });

    }
}