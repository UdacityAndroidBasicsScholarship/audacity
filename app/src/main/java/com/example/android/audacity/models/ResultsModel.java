package com.example.android.audacity.models;

public class ResultsModel {

    private int mProfileImageId;
    private String mQuiz_ChallengeName;
    private String mModeratorName;
    private String mPostedDate;

    public ResultsModel(int profileImageId, String quiz_challengeName, String moderatorName, String postedDate) {
        this.mProfileImageId = profileImageId;
        this.mQuiz_ChallengeName = quiz_challengeName;
        this.mModeratorName = moderatorName;
        this.mPostedDate = postedDate;
    }

    public int getmProfileImageId() {
        return mProfileImageId;
    }

    public String getmQuiz_ChallengeName() {
        return mQuiz_ChallengeName;
    }

    public String getmModeratorName() {
        return mModeratorName;
    }

    public String getmPostedDate() {
        return mPostedDate;
    }
}
