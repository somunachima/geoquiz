package com.example.geoquiz;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button mTrueButton = findViewById(R.id.btn_true);
        mTrueButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the text is true
                // If it is true, change the background colour to green
                findViewById(R.id.activity_quiz).setBackgroundColor(Color.GREEN);
                // Toast notification saying True
                Toast.makeText(
                        QuizActivity.this,
                                R.string.correct_toast,
                                Toast.LENGTH_SHORT
                ).show();
            }
        });

        Button mFalseButton = findViewById(R.id.btn_false);
        mFalseButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the text is false
                // If it is false, change the background to red
                findViewById(R.id.activity_quiz).setBackgroundColor(Color.RED);
                // Toast notification saying False
                Toast.makeText(
                        QuizActivity.this,
                                R.string.incorrect_toast,
                                Toast.LENGTH_SHORT
                ).show();
            }
        });
    }

}
