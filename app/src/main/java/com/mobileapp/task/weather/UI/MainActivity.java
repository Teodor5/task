package com.mobileapp.task.weather.UI;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            Intent x = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(x);
    }
}
