package com.example.android.mathquiz;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import android.app.Application;


public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        if(name.matches(""))
        {String text=getResources().getText(R.string.warning_name).toString();
            Toast.makeText(this,text,Toast.LENGTH_LONG).show();
            return;}
        AndroidApp.name=name;
        Intent intent = new Intent(this, Question1Activity.class);
        startActivity(intent);}
}