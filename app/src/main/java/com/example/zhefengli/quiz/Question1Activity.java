package com.example.zhefengli.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                .replace(R.id.main_fragment_container, Question1Fragment.newInstance(null, null))
                .addToBackStack(null)
                .commit();
        //TA end
    }









}
