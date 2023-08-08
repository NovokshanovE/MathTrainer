package com.enovoksh.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Integer A = 5, B = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewExample = findViewById(R.id.textViewExample);


        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button buttonAnswer = findViewById(R.id.buttonAnswer);
        TextView IncorrectAnswer = findViewById(R.id.textViewIncorrectAnswer);
        TextView CorrectAnswer = findViewById(R.id.textViewCorrectAnswer);

        buttonAnswer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String text = editTextAnswer.getText().toString();
                int number = Integer.parseInt(text);
                //String[] example =  textViewExample.getText().toString().split(" + ");
                if(number == (A+B)){
                    A = (int)(Math.random()*200);
                    B = (int)(Math.random()*200);
                    String textExample = A.toString() + " + " + B.toString() + " = ?";
                    CorrectAnswer.setVisibility(View.VISIBLE);
                    IncorrectAnswer.setVisibility(View.GONE);
                    textViewExample.setText(textExample);
                    editTextAnswer.setText(null);
                }
                else{

                    IncorrectAnswer.setVisibility(View.VISIBLE);
                    CorrectAnswer.setVisibility(View.GONE);
                }
            }
        });
    }
}