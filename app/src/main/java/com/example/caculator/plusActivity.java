package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class plusActivity extends AppCompatActivity {


    private TextInputEditText num1;
    private TextInputEditText  num2;
Button sum;
TextView ShowText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);


        num1 = (TextInputEditText)findViewById(R.id.e1);
        num2 = (TextInputEditText)findViewById(R.id.e2);
        sum = findViewById(R.id.sumBtn);
        ShowText = findViewById(R.id.textSum);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num12 = num1.getText().toString();
                int a = Integer.parseInt(num12);
                String num22 = num2.getText().toString();
                int b = Integer.parseInt(num22);
                int c = a+b;
                ShowText.setText("Your Answer is : "+c);


            }
        });
    }
}
