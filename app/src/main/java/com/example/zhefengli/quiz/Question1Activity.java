package com.example.zhefengli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//import android.view.Menu;
//import android.view.MenuItem;

/**
 * Created by zhefengli on 2/14/16.
 */
public class Question1Activity extends AppCompatActivity {
    private static EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, Question1Fragment.newInstance())
                .addToBackStack(null)
                .commit();
    }

    public void submitPressed(View view) {
        editText = (EditText)findViewById(R.id.editText);
        String question1Answer = editText.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("userAnswer1", question1Answer);
        Intent gamePlay = new Intent(this, Question2Activity.class);
        gamePlay.putExtras(bundle);
        startActivity(gamePlay);
    }
}
