package com.example.simplequizapp;

import java.util.ArrayList;
import java.util.List;

public class AnswerArray {
    private int questionNumber;
    private List<String> answerList=new ArrayList<>();

    public AnswerArray()
    {

        answerList.add("A");//0
        answerList.add("B");//1
        answerList.add("C");//2
        answerList.add("D");//3
        answerList.add("E");//4

    }

    public String getAnswer(int questionNumber)
    {
        this.questionNumber=questionNumber;
        return answerList.get(questionNumber);
    }


}
