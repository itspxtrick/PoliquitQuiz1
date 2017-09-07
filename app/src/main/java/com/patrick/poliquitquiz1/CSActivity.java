package com.patrick.poliquitquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
    }

    public void goToIT (View view){
        Intent intent = new Intent(this, ITActivity.class);
        startActivity(intent);
    }

    public void goToIS (View view){
        Intent intent = new Intent(this, ISActivity.class);
        startActivity(intent);
    }

    public void goToHome (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
