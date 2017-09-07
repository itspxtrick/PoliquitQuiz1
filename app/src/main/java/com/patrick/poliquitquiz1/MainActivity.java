package com.patrick.poliquitquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCS (View view){
        Intent intent = new Intent(this, CSActivity.class);
        startActivity(intent);
    }

    public void goToIT (View view){
        Intent intent = new Intent(this, ITActivity.class);
        startActivity(intent);
    }

    public void goToIS (View view){
        Intent intent = new Intent(this, ISActivity.class);
        startActivity(intent);
    }
}
