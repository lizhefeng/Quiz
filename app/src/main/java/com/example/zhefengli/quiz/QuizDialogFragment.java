package com.example.zhefengli.quiz;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.app.AlertDialog;
import android.app.DialogFragment;

/**
 * Created by zhefengli on 2/15/16.
 */
public class QuizDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        String question1Answer = getArguments().getString("userAnswer1");
        String question2Answer = getArguments().getString("userAnswer2");
        if(question1Answer == null || question2Answer == null)
            builder.setTitle("Your answers are not complete.");
        else if(question1Answer.equals("2") && question2Answer.equals("Wisconsin"))
            builder.setTitle("Results:\n1: Correct; 2: Correct");
        else if(question1Answer.equals("2") && !(question2Answer.equals("Wisconsin")))
            builder.setTitle("Results:\n1: Correct; 2: Wrong");
        else if(!(question1Answer.equals("2")) && question2Answer.equals("Wisconsin"))
            builder.setTitle("Results:\n1: Wrong; 2: Correct");
        else if(!(question1Answer.equals("2")) && !(question2Answer.equals("Wisconsin")))
            builder.setTitle("Results:\n1: Wrong; 2: Wrong");

        builder.setMessage("Take the quiz again?");
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Intent gamePlay = new Intent(getActivity(), Question1Activity.class);
                startActivity(gamePlay);
            }
        });

        builder.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        return builder.create();
    }
}
