package com.example.simplequizapp;

import java.util.ArrayList;
import java.util.List;

public class QstnArray {
    private int questionNumber;
    private List<String> questionList=new ArrayList<>();

    public QstnArray()
    {

        questionList.add("how to write 'a' in capital letter");//0
        questionList.add("Rhow to write 'b' in capital letter");//1
        questionList.add("how to write 'c' in capital letter");//2
        questionList.add("how to write 'd' in capital letter");//3
        questionList.add("how to write 'e' in capital letter");//4


    }

    public String getQuestion(int questionNumber)
    {
        this.questionNumber=questionNumber;
        return questionList.get(questionNumber);
    }
    public int getquestionListLength()
    {
        return questionList.size();
    }

}
