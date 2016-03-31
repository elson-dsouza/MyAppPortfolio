package com.example.elson.myappportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment()throws IOException{
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View mainView= inflater.inflate(R.layout.fragment_main, container, false);
        View.OnClickListener listen=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast message=Toast.makeText(getActivity().getApplicationContext(),"Test",Toast.LENGTH_SHORT);
                message.setGravity(Gravity.BOTTOM, 0, 0);
                message.setDuration(Toast.LENGTH_SHORT);
                switch (v.getId()) {
                    case R.id.spotify_button:
                        message.setText("This button will launch my Spotify Streamer app!");
                        break;
                    case R.id.capstone_button:
                        message.setText("This button will launch my Capstone app!");
                        break;
                    case R.id.build_button:
                        message.setText("This button will launch my Build It Bigger app!");
                        break;
                    case R.id.scores_button:
                        message.setText("This button will launch my Scores app!");
                        break;
                    case R.id.library_button:
                        message.setText("This button will launch my Library app!");
                        break;
                    case R.id.xyz_button:
                        message.setText("This button will launch my XYZ Reader app");
                        break;
                }
                message.show();
            }
        };
        Button SpotifyButton=(Button)mainView.findViewById(R.id.spotify_button);
        SpotifyButton.setOnClickListener(listen);
        Button CapstoneButton=(Button)mainView.findViewById(R.id.capstone_button);
        CapstoneButton.setOnClickListener(listen);
        Button BuildButton=(Button)mainView.findViewById(R.id.build_button);
        BuildButton.setOnClickListener(listen);
        Button ScoresButton=(Button)mainView.findViewById(R.id.scores_button);
        ScoresButton.setOnClickListener(listen);
        Button LibraryButton=(Button)mainView.findViewById(R.id.library_button);
        LibraryButton.setOnClickListener(listen);
        Button XYZButton=(Button)mainView.findViewById(R.id.xyz_button);
        XYZButton.setOnClickListener(listen);
        return mainView;
    }

}
