package com.usramrizal.pelatihanandroidday2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private ImageView logo;
    private TextView feature;
    LinearLayout funcColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funcColor = (LinearLayout) findViewById(R.id.activity_main);
        logo = (ImageView) findViewById(R.id.img);
        feature = (TextView) findViewById(R.id.txthey);
        button = (Button) findViewById(R.id.change);
        final int[]  Ldroid = {
                R.drawable.backpack,
                R.drawable.database,
                R.drawable.html,
                R.drawable.pantone} ;
        final String[] Fdroid = {"Backpacker","Database Adm","Programmer","Designer" };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerate = new Random();
                int randomNub = randomGenerate.nextInt(4);
                logo.setImageResource(Ldroid[randomNub]);
                feature.setText(Fdroid[randomNub]);
            }
        });

    }
}
