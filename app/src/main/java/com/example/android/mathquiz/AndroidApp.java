package com.example.android.mathquiz;

import android.app.Application;

/**
 * Created by Ralu on 06-Feb-18.
 */

public abstract class AndroidApp extends Application {
    public static int correct=0;
    public static int answer;
    public static int answer2;
    public static int answer3;
    public static String answer4;
    public static String answer5;
    public static String name;


        private static AndroidApp singleton;

        public static AndroidApp getInstance() {
            return singleton;
        }
        @Override
        public void onCreate() {
            super.onCreate();
            singleton = this;
        }
    }

