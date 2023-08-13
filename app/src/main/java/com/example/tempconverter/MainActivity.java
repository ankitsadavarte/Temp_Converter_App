package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaring Variables
    EditText editFar,editCel;
    Button btnToFar,btnToCel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initilizing variables"
        editFar = findViewById(R.id.edit_far);
        editCel = findViewById(R.id.edit_cel);
        btnToCel = findViewById(R.id.btn_tocel);
        btnToFar = findViewById(R.id.btn_tofar);

        //To convert temperature from fahrenheit to celsius
        btnToCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCel();
            }
        });

        //To convert temperature from celsius to fahrenheit
        btnToFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toFar();
            }
        });
    }


    //function to convert temp in fahrenheit to celsius
    private void toFar() {
        Double tempInCel = Double.parseDouble(editCel.getText().toString());
        Double tempInFar = (tempInCel*9/5)+32;
        Toast.makeText(this,tempInFar.toString()+" ℉",Toast.LENGTH_LONG).show();
    }

    //    function to convert temp to celsius
    private void toCel(){
        Double tempInFar = Double.parseDouble(editFar.getText().toString());
        Double tempInCel = (tempInFar - 32) * 5/9;
        Toast.makeText(this,tempInCel.toString()+" ℃",Toast.LENGTH_LONG).show();
    }
}