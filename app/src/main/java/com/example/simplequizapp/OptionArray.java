package com.example.simplequizapp;

import java.util.ArrayList;
import java.util.List;

public class OptionArray {

    private int questionNumber;
    private List<String> optionArray=new ArrayList<>();

    public OptionArray(int questionNumber)
    {
        this.questionNumber=questionNumber;

        if (questionNumber==0)
        {
            optionArray.add("A");
            optionArray.add("B");
            optionArray.add("C");
            optionArray.add("D");
        }
        else if (questionNumber==1)
        {
            optionArray.add("A");
            optionArray.add("B");
            optionArray.add("C");
            optionArray.add("D");
        }
        else if (questionNumber==2)
        {
            optionArray.add("A");
            optionArray.add("B");
            optionArray.add("C");
            optionArray.add("D");
        }
        else if (questionNumber==3)
        {
            optionArray.add("A");
            optionArray.add("B");
            optionArray.add("C");
            optionArray.add("D");
        }
        else if (questionNumber==4)
        {
            optionArray.add("C");
            optionArray.add("D");
            optionArray.add("E");
            optionArray.add("F");
        }
    }

    public List<String> getOptionArray() {
        return optionArray;
    }
}
