package com.example.zhefengli.quiz;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by zhefengli on 2/14/16.
 */
public class Question2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


    }

    public void showDialog(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        QuizDialogFragment quizDialogFragment = new QuizDialogFragment();
        quizDialogFragment.show(fragmentManager, "Dialog Fragment");
    }
}
