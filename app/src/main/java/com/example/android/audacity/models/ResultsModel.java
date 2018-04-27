package com.example.android.audacity.models;

public class ResultsModel {

    private String mProfileImageUrl;
    private String mQuiz_ChallengeName;
    private String mModeratorName;
    private String mPostedDate;

    public ResultsModel(String profileImageId, String quiz_challengeName, String moderatorName, String postedDate) {
        this.mProfileImageUrl = profileImageId;
        this.mQuiz_ChallengeName = quiz_challengeName;
        this.mModeratorName = moderatorName;
        this.mPostedDate = postedDate;
    }

    //constructor with no profile image - can be removed later
    public ResultsModel(String mQuiz_ChallengeName, String mModeratorName, String mPostedDate) {
        this.mQuiz_ChallengeName = mQuiz_ChallengeName;
        this.mModeratorName = mModeratorName;
        this.mPostedDate = mPostedDate;
    }

    public String getmProfileImageUrl() {
        return mProfileImageUrl;
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
