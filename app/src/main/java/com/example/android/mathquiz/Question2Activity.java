package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void from2ToQuestion1(View view){
        Intent intent = new Intent(this, Question1Activity.class);
        startActivity(intent);}
    public void from2tToQuestion3(View view){
        RadioButton answer1RadioButton= findViewById(R.id.radio_button4);
        boolean answer1 = answer1RadioButton.isChecked();
        RadioButton answer2RadioButton= findViewById(R.id.radio_button5);
        boolean answer2 = answer2RadioButton.isChecked();
        RadioButton answer3RadioButton= findViewById(R.id.radio_button6);
        boolean answer3 = answer3RadioButton.isChecked();
        if(!answer1 && !answer2 && !answer3)
        { String text=getResources().getText(R.string.error_no_answer).toString();
            Toast.makeText(this,text,Toast.LENGTH_LONG).show();
            return;}
        else if(answer1)
            AndroidApp.answer2 = answer1RadioButton.getId();
        else if(answer2)
            AndroidApp.answer2 = answer2RadioButton.getId();
        else
            AndroidApp.answer2 =answer3RadioButton.getId();

        Intent intent = new Intent(this, Question3Activity.class);
        startActivity(intent);}
}
