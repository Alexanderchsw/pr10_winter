package com.example.pr_21_101_winter_pr_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_main3 extends AppCompatActivity implements View.OnClickListener{
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView6 = findViewById(R.id.textView6);
        textView6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, activity_main2.class);
        startActivity(intent);
    }
}