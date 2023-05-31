package com.example.pr_21_101_winter_pr_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_main2 extends AppCompatActivity implements View.OnClickListener{
    ImageView imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, activity_main3.class);
        startActivity(intent);
    }
}