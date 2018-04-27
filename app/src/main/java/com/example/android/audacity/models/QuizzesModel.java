package com.example.android.audacity.models;

public class QuizzesModel {

    private int mProfileImageId;
    private String mQuizName;
    private String mModeratorName;
    private String mEndDate;

    public QuizzesModel(int profileImageId, String quizName, String moderatorName, String endDate) {
        this.mProfileImageId = profileImageId;
        this.mQuizName = quizName;
        this.mModeratorName = moderatorName;
        this.mEndDate = endDate;
    }

    public int getmProfileImageId() {
        return mProfileImageId;
    }

    public String getmQuizName() {
        return mQuizName;
    }

    public String getmModeratorName() {
        return mModeratorName;
    }

    public String getmEndDate() {
        return mEndDate;
    }
}
