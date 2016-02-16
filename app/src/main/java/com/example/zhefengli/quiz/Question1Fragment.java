package com.example.zhefengli.quiz;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhefengli on 2/14/16.
 */
public class Question1Fragment extends Fragment {

    public static Question1Fragment newInstance() {
        return new Question1Fragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_question1, container, false);
    }
}
