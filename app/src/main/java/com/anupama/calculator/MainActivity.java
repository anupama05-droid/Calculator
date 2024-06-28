package com.anupama.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=(AppCompatButton)findViewById(R.id.addbtn) ;
        b2=(AppCompatButton)findViewById(R.id.subbtn) ;
        b3=(AppCompatButton)findViewById(R.id.multbtn) ;
        b4=(AppCompatButton)findViewById(R.id.divbtn) ;

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4=new Intent(getApplicationContext(),Division.class);
                startActivity(i4);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(i3);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2=new Intent(getApplicationContext(),Subtraction.class);
                startActivity(i2);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1=new Intent(getApplicationContext(),Addition.class);
                startActivity(i1);
            }
        });
    }
}