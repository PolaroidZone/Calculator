package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button help,settings, about, calculator;
    TextView tvh,tvs,tva,tvc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tva = findViewById(R.id.textViewA);
        tva.setOnClickListener(this);
        tvc = findViewById(R.id.textViewC);
        tvc.setOnClickListener(this);
        tvh = findViewById(R.id.textViewH);
        tvh.setOnClickListener(this);
        tvs = findViewById(R.id.textViewS);
        tvs.setOnClickListener(this);

        help = findViewById(R.id.Help);
        help.setOnClickListener(this);
        settings = findViewById(R.id.Settings);
        settings.setOnClickListener(this);
        about = findViewById(R.id.about);
        about.setOnClickListener(this);
        calculator = findViewById(R.id.calculator);
        calculator.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.calculator || id == R.id.textViewC) {
            Intent intent3 = new Intent(this, MainActivityStandard.class);//"intent" used to open an activity
            startActivity(intent3);
        } else if (id == R.id.Help || id == R.id.textViewH) {
            Intent intent2 = new Intent(this, MainActivityHelp.class);
            startActivity(intent2);
        } else if (id == R.id.about || id == R.id.textViewA) {
            Intent intent1 = new Intent(this, MainActivityAbout.class);
            startActivity(intent1);
        } else if (id == R.id.Settings || id == R.id.textViewS) {
            Intent intent = new Intent(this, MainActivitySettings.class);
            startActivity(intent);
        }
    }
}
