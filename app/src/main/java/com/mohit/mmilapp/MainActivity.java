package com.mohit.mmilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText kg,l,km;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        kg=findViewById(R.id.editText);
        l=findViewById(R.id.editText2);
        km=findViewById(R.id.editText3);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kg.getText().toString().isEmpty()||l.getText().toString().isEmpty()||km.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter atleast one value to continue", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, second.class);
                    intent.putExtra("kg", kg.getText().toString());
                    intent.putExtra("l", l.getText().toString());
                    intent.putExtra("km", km.getText().toString());
                    Toast.makeText(getApplicationContext(), "Submitted Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });



    }
}