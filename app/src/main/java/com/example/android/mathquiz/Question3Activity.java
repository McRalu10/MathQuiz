package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }
    public void from3ToQuestion2(View view){
        Intent intent = new Intent(this, Question2Activity.class);
        startActivity(intent);}
    public void from3tToQuestion4(View view){
        CheckBox answer1CheckBox = (CheckBox)findViewById(R.id.check_box1);
        boolean answer1 = answer1CheckBox.isChecked();
        CheckBox answer2CheckBox = (CheckBox)findViewById(R.id.check_box2);
        boolean answer2 = answer2CheckBox.isChecked();
        CheckBox answer3CheckBox = (CheckBox)findViewById(R.id.check_box3);
        boolean answer3 = answer3CheckBox.isChecked();
        CheckBox answer4CheckBox = (CheckBox)findViewById(R.id.check_box4);
        boolean answer4 = answer4CheckBox.isChecked();
        if(!answer1 && !answer2 && !answer3 && !answer4)
        { String text=getResources().getText(R.string.error_no_answer).toString();
            Toast.makeText(this,text,Toast.LENGTH_LONG).show();
            return;}
        else if(answer1)
            AndroidApp.answer3 = answer1CheckBox.getId();
        else if(answer2)
            AndroidApp.answer3 = answer2CheckBox.getId();
        else if(answer3)
            AndroidApp.answer3 =answer3CheckBox.getId();
        else
            AndroidApp.answer3 =answer4CheckBox.getId();

        Intent intent = new Intent(this, Question4Activity.class);
        startActivity(intent);}
}
