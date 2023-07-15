package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityAbout extends AppCompatActivity implements View.OnClickListener {

    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_about);

        version = findViewById(R.id.textView6);
        version.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int select = v.getId();
        if(select == R.id.textView6){
            Toast.makeText(getApplicationContext(),"beta version: 0.1 ",Toast.LENGTH_SHORT).show();
        }
    }
}