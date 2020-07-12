package com.abbar.convertisseurtemperateur;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText Celsius;
    EditText Fahrenheit;
    Button btnCalculerCF;
    Button btnCalculerFC;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Celsius=(EditText) findViewById(R.id.celsius);
        Fahrenheit=(EditText) findViewById(R.id.fahrenheit);
        btnCalculerCF=(Button) findViewById(R.id.CalculerCF);
        btnCalculerFC=(Button) findViewById(R.id.CalculerFC);

        btnCalculerCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Celsius.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Remplir Le Champs Celsius svp",Toast.LENGTH_SHORT).show();

                }else{
                    int c1=Integer.parseInt(Celsius.getText().toString());
                    Fahrenheit.setText("");
                    int F1=(c1*9)/5+32;
                    Fahrenheit.setText(F1+"");
                }

            }
        });

        btnCalculerFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Fahrenheit.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Remplir Le Champs fahrenheit svp",Toast.LENGTH_SHORT).show();

                }else{
                    int F2=Integer.parseInt(Fahrenheit.getText().toString());
                    Celsius.setText("");
                    double C2=(F2-32)*5/9;
                    Celsius.setText(C2+"");
                }

            }
        });




    }
}
