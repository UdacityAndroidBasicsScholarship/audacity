package com.example.android.audacity.models;

public class ChallengesModel {

    private int mProfileImageId;
    private String mChallengeName;
    private String mModeratorName;
    private String mEndDate;

    public ChallengesModel(int profileImageId, String challengeName, String moderatorName, String endDate) {
        this.mProfileImageId = profileImageId;
        this.mChallengeName = challengeName;
        this.mModeratorName = moderatorName;
        this.mEndDate = endDate;
    }

    public int getmProfileImageId() {
        return mProfileImageId;
    }

    public String getmChallengeName() {
        return mChallengeName;
    }

    public String getmModeratorName() {
        return mModeratorName;
    }

    public String getmEndDate() {
        return mEndDate;
    }
}
