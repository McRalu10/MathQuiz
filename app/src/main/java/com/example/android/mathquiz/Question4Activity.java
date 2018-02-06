package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }
    public void from4ToQuestion3(View view){
        Intent intent = new Intent(this, Question3Activity.class);
        startActivity(intent);}
    public void from4tToQuestion5(View view){
        EditText answerEditText = (EditText)findViewById(R.id.answer_field);
        String answer=answerEditText.getText().toString();
        AndroidApp.answer4=answer;
        if(answer.matches(""))
        { String text=getResources().getText(R.string.error2_no_answer).toString();
            Toast.makeText(this,text,Toast.LENGTH_LONG).show();
            return;}
        Intent intent = new Intent(this, Question5Activity.class);
        startActivity(intent);}
}
