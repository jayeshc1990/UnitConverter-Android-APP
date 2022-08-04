package com.jayesh.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.output);
        edittext = findViewById(R.id.input);
//        Method1 : Using onClickListener
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Clicked. \n This is Toast", Toast.LENGTH_SHORT).show(); //This is Toast example
//                String input = edittext.getText().toString();
//                Integer kg = Integer.parseInt(input);
//                Double pound = kg * 2.205;
//                textview.setText(kg + " kg in pounds is "+ pound);
//            }
//        });
    }
//    Method2 : Using onClick Attribute
    public void calculate(View view){

        Toast.makeText(MainActivity.this, "Button Clicked. \n This is Toast", Toast.LENGTH_SHORT).show();
        String input = edittext.getText().toString();
        Integer kg = Integer.parseInt(input);
        Double pound = kg * 2.205;
        textview.setText(kg + " kg in pounds is "+ pound);

    }
}