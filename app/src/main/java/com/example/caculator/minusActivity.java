package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class minusActivity extends AppCompatActivity {
    private TextInputEditText num1;
    private TextInputEditText  num2;
    Button minus;
    TextView ShowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minus);

        num1 = (TextInputEditText)findViewById(R.id.e3);
        num2 = (TextInputEditText)findViewById(R.id.e4);
        minus = findViewById(R.id.minusBtn);
        ShowText = findViewById(R.id.textMinus);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num12 = num1.getText().toString();
                int a = Integer.parseInt(num12);
                String num22 = num2.getText().toString();
                int b = Integer.parseInt(num22);


                if(a>b){
                    int c = a-b;
                    ShowText.setText("Your Answer is : "+c);

                }else {
                    int t = b - a;
                    ShowText.setText("Your Answer is : " + t);


                }

            }
        });
    }
}
