package com.mohit.mmilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class second extends AppCompatActivity {
    TextView text1,text2,text3;
    Float g,ml,m,kg,l,km;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        Intent intent = getIntent();
        kg = Float.valueOf(intent.getStringExtra("kg"));
        l = Float.valueOf(intent.getStringExtra("l"));
        km = Float.valueOf(intent.getStringExtra("km"));
        g=kg*1000;
        ml=l*1000;
        m=km*1000;
        text1.setText(kg+" kilograms is "+g+" grams");
        text2.setText(l+" Litres is "+ml+" mililitres");
        text3.setText(km+" kilometers is "+m+" meters");
    }
}