package com.example.v1;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MainActivity21 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        TextView link = (TextView) findViewById(R.id.hiperlink21);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        int rnd = new Random().nextInt(11);;

        TextView tv = findViewById(R.id.textView31);
        if(rnd>5) tv.setText(R.string.txt211);
        else tv.setText(R.string.txt212);
    }
}