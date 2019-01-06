package com.fabianrk.democalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_main);
    }

    public void LogIn(View v) {
        String button_id;
        button_id = ((Button) v).getText().toString();
        if (button_id.equals("Sign Up")) {
            Intent Login = new Intent(this, LogInActivity.class);
            startActivity(Login);
        }
    }
}

