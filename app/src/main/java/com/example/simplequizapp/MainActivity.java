package com.example.simplequizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    QstnArray qstnArray;
    AnswerArray answerArray;
    OptionArray optionArray;

    List<Integer> questionNumber;
    List<String> optArray;

    int i=0;

    TextView questionTextView;

    Button button1;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView =findViewById(R.id.questionTextView);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        qstnArray = new QstnArray();
        answerArray = new AnswerArray();

        questionNumber = new ArrayList<>();

        for (int j = 0; j < qstnArray.getquestionListLength(); j++) {
            questionNumber.add(j);
        }

        //shuffle the question list
        Collections.shuffle(questionNumber);


        setQuestion(i);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                } else {
                    i++;
                    Toast.makeText(getApplicationContext(), "wrong Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);

                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                } else {
                    i++;
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                } else {
                    i++;
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                } else {
                    i++;
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    setQuestion(i);
                }
            }
        });

    }





    public void setQuestion(int i) {

        try {
            if (i < questionNumber.size()) {
                questionTextView.setText(qstnArray.getQuestion(questionNumber.get(i)));
                optionArray = new OptionArray(questionNumber.get(i));
                optArray = new ArrayList<>(optionArray.getOptionArray());

                //suffle the options list
                Collections.shuffle(optArray);
                button1.setText(optArray.get(0));
                button2.setText(optArray.get(1));
                button3.setText(optArray.get(2));
                button4.setText(optArray.get(3));

            } else {
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                Toast.makeText(getApplicationContext(), "game over", Toast.LENGTH_SHORT).show();

            }
        } catch (Exception e) {

        }


    }
}
