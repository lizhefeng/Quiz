package com.example.zhefengli.quiz;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
/**
 * Created by zhefengli on 2/15/16.
 */
public class Question2Fragment extends Fragment {
    private RadioGroup radioGroup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question2, container, false);

        radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        radioGroup.clearCheck();





        return view;
    }



}
