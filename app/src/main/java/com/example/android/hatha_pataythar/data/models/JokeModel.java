package com.example.android.hatha_pataythar.data.models;

import android.content.Context;

import com.example.android.hatha_pataythar.HaThaApp;
import com.example.android.hatha_pataythar.R;
import com.example.android.hatha_pataythar.data.vos.JokeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nawthuellay on 25/06/2016.
 */
public class JokeModel {
    private static JokeModel objInstance;
    private List<JokeVO> jokeList;

    private JokeModel()
    {
        jokeList = setUpInitialJokes();
    }

    public static JokeModel getInstance() {
        if (objInstance == null) {
            objInstance = new JokeModel();
        }
        return objInstance;
    }

    private List<JokeVO> setUpInitialJokes() {
        Context context = HaThaApp.getContext();

        List<JokeVO> jokeList = new ArrayList<>();
        jokeList.add(new JokeVO(context.getString(R.string.joke1_title), context.getString(R.string.joke1_body), R.drawable.joke_1));
        jokeList.add(new JokeVO(context.getString(R.string.joke2_title), context.getString(R.string.joke2_body), R.drawable.joke_2));
        jokeList.add(new JokeVO(context.getString(R.string.joke3_title), context.getString(R.string.joke3_body), R.drawable.joke_3));
        return jokeList;
    }

    public JokeVO getJoke(int index) {
        return jokeList.get(index);
    }


}
