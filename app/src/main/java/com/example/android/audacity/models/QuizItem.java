package com.example.android.audacity.models;

public class QuizItem {

    private int quizIcon;
    private String title, subTitle, dateCreated;

    public QuizItem(int quizIcon, String title, String subTitle, String dateCreated) {
        this.quizIcon = quizIcon;
        this.title=title;
        this.subTitle=subTitle;
        this.dateCreated=dateCreated;
    }

    public int getQuizIcon() {
        return quizIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDateCreated() {
        return dateCreated;
    }
}
