package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class divideActivity extends AppCompatActivity {

    private TextInputEditText num1;
    private TextInputEditText  num2;
    Button divide;
    TextView ShowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);




        num1 = (TextInputEditText)findViewById(R.id.e7);
        num2 = (TextInputEditText)findViewById(R.id.e8);
        divide = findViewById(R.id.divideBtn);
        ShowText = findViewById(R.id.textdivide);

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num12 = num1.getText().toString();
                int a = Integer.parseInt(num12);
                String num22 = num2.getText().toString();
                int b = Integer.parseInt(num22);





                float t = a / b;
                
                ShowText.setText("Your Answer is : " + t);




            }
        });



    }
}
