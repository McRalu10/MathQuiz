package com.example.android.mathquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Question5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }
    public void from5ToQuestion4(View view){
        Intent intent = new Intent(this, Question4Activity.class);
        startActivity(intent);}
    public void from5tToQuestionFinal(View view){
        EditText answerEditText = findViewById(R.id.answer_field);
        String answer=answerEditText.getText().toString();
        if(answer.matches(""))
        { String text=getResources().getText(R.string.error2_no_answer).toString();
            Toast.makeText(this,text,Toast.LENGTH_LONG).show();
            return;}
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);}
}
