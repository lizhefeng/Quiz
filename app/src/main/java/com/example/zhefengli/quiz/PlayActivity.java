package com.example.zhefengli.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;

/**
 * Created by zhefengli on 2/14/16.
 */
public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //TA implementation
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, PlayFragment.newInstance(null, null))
                .addToBackStack(null)
                .commit();
        //TA end
    }









}
