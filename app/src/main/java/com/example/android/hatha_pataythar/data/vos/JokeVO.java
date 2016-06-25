package com.example.android.hatha_pataythar.data.vos;

/**
 * Created by nawthuellay on 25/06/2016.
 */
public class JokeVO {
    private String jokeTitle;
    private String jokeContent;
    private int jokeImage;

    public JokeVO (String jokeTitle, String jokeContent, int jokeImage){
        this.jokeTitle=jokeTitle;
        this.jokeContent=jokeContent;
        this.jokeImage=jokeImage;
    }

    public String getJokeTitle() {
        return jokeTitle;
    }

    public String getJokeContent() {
        return jokeContent;
    }

    public int getJokeImage() {
        return jokeImage;
    }
}
