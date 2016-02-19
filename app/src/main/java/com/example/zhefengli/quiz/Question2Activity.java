package com.example.zhefengli.quiz;
import android.app.FragmentManager;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by zhefengli on 2/14/16.
 */
public class Question2Activity extends AppCompatActivity {
    private static RadioButton radioButton;
    private static RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


    }

    public void showMyDialog(View view) {
        Bundle bundle = getIntent().getExtras();
        String question1Answer = bundle.getString("userAnswer1");
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioButton = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
        String question2Answer = radioButton.getText().toString();
        Bundle bundle1 = new Bundle();
        bundle1.putString("userAnswer1", question1Answer);
        bundle1.putString("userAnswer2", question2Answer);

        FragmentManager fragmentManager = getFragmentManager();
        QuizDialogFragment quizDialogFragment = new QuizDialogFragment();

        quizDialogFragment.setArguments(bundle1);
        quizDialogFragment.show(fragmentManager, "Dialog Fragment");
    }
}
