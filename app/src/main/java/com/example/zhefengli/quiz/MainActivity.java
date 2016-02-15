package com.example.zhefengli.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            return;
        }
    }

    public void playPressed(View view) {
        //TODO: Put to start game play activity
        Intent gamePlay = new Intent(this, Question1Activity.class);
        startActivity(gamePlay);
    }
}
