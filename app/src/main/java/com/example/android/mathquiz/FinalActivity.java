package com.example.android.mathquiz;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        RadioButton answer1RadioButton = findViewById(R.id.radio_button1);
        RadioButton answer2RadioButton = findViewById(R.id.radio_button2);
        RadioButton answer3RadioButton = findViewById(R.id.radio_button3);
        TextView textView1 = findViewById(R.id.text_view1);
        if (AndroidApp.answer == R.id.radio_button1) {
            answer1RadioButton.setChecked(true);
            AndroidApp.correct++;
            textView1.setText(R.string.correct);
            textView1.setTextColor(getColor(R.color.green));
            answer2RadioButton.setEnabled(false);
            answer3RadioButton.setEnabled(false);
        } else if (AndroidApp.answer == R.id.radio_button2) {
            answer2RadioButton.setChecked(true);
            answer1RadioButton.setEnabled(false);
            answer3RadioButton.setEnabled(false);
            textView1.setText(R.string.wrong);
            textView1.setTextColor(getColor(R.color.red));
        } else {
            answer1RadioButton.setEnabled(false);
            answer2RadioButton.setEnabled(false);
            answer3RadioButton.setChecked(true);
            textView1.setText(R.string.wrong);
            textView1.setTextColor(getColor(R.color.red));
        }
        RadioButton answer4RadioButton = findViewById(R.id.radio_button4);
        RadioButton answer5RadioButton = findViewById(R.id.radio_button5);
        RadioButton answer6RadioButton = findViewById(R.id.radio_button6);
        TextView textView2 = findViewById(R.id.text_view2);
        if (AndroidApp.answer2 == R.id.radio_button4) {
            answer4RadioButton.setChecked(true);
            answer5RadioButton.setEnabled(false);
            answer6RadioButton.setEnabled(false);
            textView2.setText(R.string.wrong);
            textView2.setTextColor(getColor(R.color.red));
        } else if (AndroidApp.answer2 == R.id.radio_button5) {
            answer5RadioButton.setChecked(true);
            answer4RadioButton.setEnabled(false);
            answer6RadioButton.setEnabled(false);
            textView2.setText(R.string.wrong);
            textView2.setTextColor(getColor(R.color.red));
        } else {
            answer4RadioButton.setEnabled(false);
            answer5RadioButton.setEnabled(false);
            answer6RadioButton.setChecked(true);
            AndroidApp.correct++;
            textView2.setText(R.string.correct);
            textView2.setTextColor(getColor(R.color.green));
        }
        CheckBox answer1CheckBox = findViewById(R.id.check_box1);
        CheckBox answer2CheckBox = findViewById(R.id.check_box2);
        CheckBox answer3CheckBox = findViewById(R.id.check_box3);
        CheckBox answer4CheckBox = findViewById(R.id.check_box4);
        TextView textView3 = findViewById(R.id.text_view3);
        int ok = 0;
        if (AndroidApp.answer3 == R.id.check_box1) {
            answer1CheckBox.setChecked(true);
            answer2CheckBox.setEnabled(false);
            answer3CheckBox.setEnabled(false);
            answer4CheckBox.setEnabled(false);
        }
        if (AndroidApp.answer3 == R.id.check_box2) {
            answer2CheckBox.setChecked(true);
            answer1CheckBox.setEnabled(false);
            answer3CheckBox.setEnabled(false);
            answer4CheckBox.setEnabled(false);
            ok++;
        }
        if (AndroidApp.answer3 == R.id.check_box3) {
            answer1CheckBox.setEnabled(false);
            answer2CheckBox.setEnabled(false);
            answer3CheckBox.setChecked(true);
            answer4CheckBox.setEnabled(false);
            ok++;
        }
        if (AndroidApp.answer3 == R.id.check_box4) {
            answer1CheckBox.setEnabled(false);
            answer2CheckBox.setEnabled(false);
            answer3CheckBox.setEnabled(false);
            answer4CheckBox.setChecked(true);
        }
        if (ok == 2) {
            textView3.setText(R.string.correct);
            textView3.setTextColor(getColor(R.color.green));
            AndroidApp.correct++;
        } else {
            textView3.setText(R.string.wrong);
            textView3.setTextColor(getColor(R.color.red));
        }
        EditText editText1 = findViewById(R.id.answer4_field);
        TextView textView4 = findViewById(R.id.text_view4);
        editText1.setClickable(false);
        if (AndroidApp.answer4.matches("-1")) {
            AndroidApp.correct++;
            textView4.setText(R.string.correct);
            textView4.setTextColor(getColor(R.color.green));
        } else {
            textView4.setText(R.string.wrong);
            textView4.setTextColor(getColor(R.color.red));
        }
        EditText editText2 = findViewById(R.id.answer5_field);
        TextView textView5 = findViewById(R.id.text_view5);
        editText2.setClickable(false);
        if (AndroidApp.answer5.matches("0")) {
            AndroidApp.correct++;
            textView5.setText(R.string.correct);
            textView5.setTextColor(getColor(R.color.green));
        } else {
            textView4.setText(R.string.wrong);
            textView4.setTextColor(getColor(R.color.red));
        }
    }

    public void getResults(View view) {
        TextView finalResult= findViewById(R.id.final_result);
        String result=getString(AndroidApp.correct);
        result=result+"/5";
        finalResult.setText(result);
    }
    /**Intent intent = new Intent(Intent.ACTION_SENDTO);
     intent.setData(Uri.parse("mailto:"));
     intent.putExtra(Intent.EXTRA_SUBJECT, "MathQuizResults for"+AndroidApp.name);
     intent.putExtra(Intent.EXTRA_TEXT,message);
     if (intent.resolveActivity(getPackageManager()) != null) {
     startActivity(intent);
     }**/
}









