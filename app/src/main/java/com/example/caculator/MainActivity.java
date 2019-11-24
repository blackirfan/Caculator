package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button plus, minus, multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus =findViewById(R.id.plusBtn);
        minus = findViewById(R.id.minusBtn);
        multiply = findViewById(R.id.multiplyBtn);
        divide = findViewById(R.id.divideBtn);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plus =new Intent(MainActivity.this,plusActivity.class);
                startActivity(plus);
            }
        });

        //minus



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent minus = new Intent(MainActivity.this,minusActivity.class);
                startActivity(minus);
            }
        });

        //multiply
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent multiply = new Intent(MainActivity.this,multiplyActivity.class);
                startActivity(multiply);
            }


        });
        //divide
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent divide = new Intent(MainActivity.this,divideActivity.class);
                startActivity(divide);
            }
        });


    }
}
