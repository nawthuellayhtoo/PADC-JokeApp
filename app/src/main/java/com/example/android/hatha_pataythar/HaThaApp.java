package com.example.android.hatha_pataythar;

import android.app.Application;
import android.content.Context;

/**
 * Created by nawthuellay on 23/06/2016.
 */
public class HaThaApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
