package com.example.geoquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

//    QuizActivity(
//            Button mTrueButton,
//            Button mFalseButton
//    ) {
//        this.mTrueButton = mTrueButton;
//        this.mFalseButton = mFalseButton;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.btn_true);
        mTrueButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the text is true
                // If it is true, change the background colour to green
                // If it is not true, change the background to red
                // Toast notification saying True or False
            }
        });

        mFalseButton = (Button) findViewById(R.id.btn_false);
    }
}
