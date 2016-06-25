package com.example.android.hatha_pataythar.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.hatha_pataythar.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class Joke1Fragment extends Fragment {

    public Joke1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_joke1, container, false);
        final Button btnNext=(Button)view.findViewById(R.id.btn_next1);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Joke2Fragment fragment = new Joke2Fragment();
                //that can be used old android version
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });
        final Button btnPrevious=(Button)view.findViewById(R.id.btn_previous1);
        btnPrevious.setBackgroundColor(Color.GRAY);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"အရင္ဟာ မရိွပါ",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
