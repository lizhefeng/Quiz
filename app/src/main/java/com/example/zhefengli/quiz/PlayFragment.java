package com.example.zhefengli.quiz;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by zhefengli on 2/14/16.
 */
public class PlayFragment extends Fragment {

    public static PlayFragment newInstance(String player1Choice, String player2Choice) {
        PlayFragment fragment = new PlayFragment();
        //Bundle args = new Bundle();
        //args.putString(ARG_PLAYER_ONE, player1Choice);
        //args.putString(ARG_PLAYER_TWO, player2Choice);
        //fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_play, container, false);
    }

}
