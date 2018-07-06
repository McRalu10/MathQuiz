package com.example.android.mathquiz;

import android.app.Application;

public abstract class AndroidApp extends Application {
    public static int correct=0;
    public static int answer;
    public static int answer2;
    public static int answer3;
    public static String answer4;
    public static String answer5;
    public static String name;


        @Override
        public void onCreate() {
            super.onCreate();
        }
    }

