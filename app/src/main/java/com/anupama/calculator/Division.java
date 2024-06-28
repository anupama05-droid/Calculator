package com.anupama.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Division extends AppCompatActivity {

    EditText e1,e2;
    AppCompatButton bn1,bn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);

            e1 = (EditText) findViewById(R.id.fnum);
            e2 = (EditText) findViewById(R.id.snum);
            bn1 = (AppCompatButton) findViewById(R.id.divisionbtn);
            bn2 = (AppCompatButton) findViewById(R.id.backtomenubtn);

            bn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in1 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(in1);
                }
            });
            bn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String getFnum = e1.getText().toString();
                        String getSnum = e2.getText().toString();
                        int num1 = Integer.parseInt(getFnum);
                        int num2 = Integer.parseInt(getSnum);
                        int qou = num1/num2;
                        Toast.makeText(getApplicationContext(), String.valueOf(qou), Toast.LENGTH_LONG).show();
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                    }
                }
            });

    }
}