package com.example.zhefengli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;

/**
 * Created by zhefengli on 2/14/16.
 */
public class Question1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        //TA implementation
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, Question1Fragment.newInstance())
                .addToBackStack(null)
                .commit();
        //TA end
    }

    public void submitPressed(View view) {
        //TODO: Put to start game play activity
        Intent gamePlay = new Intent(this, Question2Activity.class);
        startActivity(gamePlay);
    }









}
