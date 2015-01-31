package com.example.prabir.interactivestory.model;

/**
 * Created by prabir on 12/30/14.
 */
public class Choice {
    private int mNextPage;
    private String mText;

    public Choice(String text, int nextPage) {
        mNextPage = nextPage;
        mText = text;
    }
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
