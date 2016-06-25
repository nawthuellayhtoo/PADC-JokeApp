package com.example.android.hatha_pataythar.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.hatha_pataythar.R;

/**
 * Created by nawthuellay on 24/06/2016.
 */
public class Joke2Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_joke2, container, false);
        final Button btnNext=(Button)view.findViewById(R.id.btn_next2);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Joke3Fragment fragment = new Joke3Fragment();
                //that can be used old android version
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });
        Button btnPrevious=(Button)view.findViewById(R.id.btn_previous2);
        btnPrevious.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Joke1Fragment fragment = new Joke1Fragment();
                //that can be used old android version
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });
        return view;
    }
}
