package com.example.judas.geoquiz;

/**
 * Created by Judas on 10/11/2017.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    //yes

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;}

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResID(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue){
        mAnswerTrue = answerTrue;
    }
}
