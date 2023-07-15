package com.example.calculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO;
import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES;
import static androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode;

@SuppressWarnings("ALL")
public class MainActivitySettings extends AppCompatActivity {

    Switch s1;
    public static final String myNightprefs = "nightModePrefs";
    public static final String myDayprefs = "lightMode";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_settings);
        sharedPreferences = getSharedPreferences(myNightprefs, Context.MODE_PRIVATE);
        s1 = findViewById(R.id.switch1);
        checkIfActive();
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked){
                    setDefaultNightMode(MODE_NIGHT_YES);
                    saveNightModeState(true);
                    return;
                }else {
                    setDefaultNightMode(MODE_NIGHT_NO);
                    saveNightModeState(false);
                    return;

                }
            }
        });
    }

    private void saveNightModeState(boolean nightMode) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(myDayprefs, nightMode);
        editor.apply();
    }
    public void checkIfActive(){
        if (sharedPreferences.getBoolean(myDayprefs,false)){
            s1.setChecked(true);
            setDefaultNightMode(MODE_NIGHT_YES);
        }else{
            s1.setChecked(false);
            setDefaultNightMode(MODE_NIGHT_NO);
        }
    }
}