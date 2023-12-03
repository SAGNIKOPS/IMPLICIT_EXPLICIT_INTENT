package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        Button button2 = findViewById(R.id.button2);

        //Explicit Content
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSecond();
            }
        });
        //IMPLICIT CONTENT
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSomeWebpage();
            }
        });
    }
    public void onSecond()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    //Implicit Intent
    protected void onSomeWebpage()
    {
        Uri webpage = Uri.parse("https://www.google.co.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}