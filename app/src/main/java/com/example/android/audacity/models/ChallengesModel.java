package com.example.android.audacity.models;

public class ChallengesModel {

    private String mProfileImageUrl;
    private String mChallengeName;
    private String mModeratorName;
    private String mEndDate;

    public ChallengesModel(String profileImageId, String challengeName, String moderatorName, String endDate) {
        this.mProfileImageUrl = profileImageId;
        this.mChallengeName = challengeName;
        this.mModeratorName = moderatorName;
        this.mEndDate = endDate;
    }

    //constructor with no profile image - can be removed later
    public ChallengesModel(String mChallengeName, String mModeratorName, String mEndDate) {
        this.mChallengeName = mChallengeName;
        this.mModeratorName = mModeratorName;
        this.mEndDate = mEndDate;
    }

    public String getmProfileImageUrl() {
        return mProfileImageUrl;
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
