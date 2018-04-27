package com.example.android.audacity.models;

public class QuizzesModel {

    private String mProfileImageUrl;
    private String mQuizName;
    private String mModeratorName;
    private String mEndDate;

    public QuizzesModel(String profileImageId, String quizName, String moderatorName, String endDate) {
        this.mProfileImageUrl = profileImageId;
        this.mQuizName = quizName;
        this.mModeratorName = moderatorName;
        this.mEndDate = endDate;
    }

    //constructor with no profile image - can be removed later
    public QuizzesModel(String mQuizName, String mModeratorName, String mEndDate) {
        this.mQuizName = mQuizName;
        this.mModeratorName = mModeratorName;
        this.mEndDate = mEndDate;
    }

    public String getmProfileImageUrl() {
        return mProfileImageUrl;
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
