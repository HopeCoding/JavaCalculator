package com.hopecoding.hesapmakinesijava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    public static double first;
    public static double second;
    public static double total = 0;

    EditText firstText;
    EditText secondText;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstText = findViewById(R.id.firstText);
        secondText = findViewById(R.id.secondText);
        resultText = findViewById(R.id.resultText);


    }


    public void topla(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")){
            resultText.setText("Don't forget to enter a number");
        }else{
            first = Double.parseDouble(firstText.getText().toString());
            second = Double.parseDouble(secondText.getText().toString());
            total = first + second;

            resultText.setText(MessageFormat.format("Sonuç:{0}", total));

        }


    }

    public void cikar(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")){
            resultText.setText("Don't forget to enter a number");
        }else{
            first = Double.parseDouble(firstText.getText().toString());
            second = Double.parseDouble(secondText.getText().toString());
            total = first - second;

            resultText.setText(MessageFormat.format("Sonuç:{0}", total));
        }


    }

    public void carp(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")){
            resultText.setText("Don't forget to enter a number");
        }else{
            first = Double.parseDouble(firstText.getText().toString());
            second = Double.parseDouble(secondText.getText().toString());
            total = first * second;

            resultText.setText(MessageFormat.format("Sonuç:{0}", total));
        }


    }

    public void bolme(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")){
            resultText.setText("Don't forget to enter a number");
        }else{
            first = Double.parseDouble(firstText.getText().toString());
            second = Double.parseDouble(secondText.getText().toString());
            total = first / second;

            resultText.setText(MessageFormat.format("Sonuç:{0}", total));
        }

    }
}