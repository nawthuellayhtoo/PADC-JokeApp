package com.example.android.hatha_pataythar.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.hatha_pataythar.R;

/**
 * Created by nawthuellay on 24/06/2016.
 */
public class Joke3Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_joke3, container, false);
        final Button btnNext=(Button)view.findViewById(R.id.btn_next3);
        btnNext.setBackgroundColor(Color.GRAY);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"ေနာက္တစ္ခု မရိွေတာ့ပါ",Toast.LENGTH_LONG).show();
            }
        });

        Button btnPrevious=(Button)view.findViewById(R.id.btn_previous3);
        btnPrevious.setOnClickListener(new View.OnClickListener(){
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
        return view;
    }
}
