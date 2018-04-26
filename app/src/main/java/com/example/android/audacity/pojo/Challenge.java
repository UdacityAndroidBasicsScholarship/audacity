package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.ChallengesFragment}
 */

public class Challenge {
    // Variable to store the challenge name
    private String mChallengeName;
    // Variable to store the challenge description
    private String mChallengeDescription;
    // starting date of the challenge
    private String mStartDate;
    // ending date of the challenge
    private String mEndDate;
    // variable to see if the deadline is crossed
    private boolean mIsDeadline;

    /**
     * Constructor
     *
     * @param challengeName        name of the challenge
     * @param challengeDescription description of the challenge
     * @param startDate            start date of the challenge
     * @param endDate              end date of the challenge
     * @param isDeadline           is the deadline over or not
     */
    public Challenge(String challengeName, String challengeDescription, String startDate,
                     String endDate, boolean isDeadline) {
        mChallengeName = challengeName;
        mChallengeDescription = challengeDescription;
        mStartDate = startDate;
        mEndDate = endDate;
        mIsDeadline = isDeadline;
    }

    /**
     * @return the challenge name
     */
    public String getChallengeName() {
        return mChallengeName;
    }

    /**
     * @return the challenge description
     */
    public String getChallengeDescription() {
        return mChallengeDescription;
    }

    /**
     * @return the start date of the challenge
     */
    public String getStartDate() {
        return mStartDate;
    }

    /**
     * @return the end date of the challenge
     */
    public String getEndDate() {
        return mEndDate;
    }

    /**
     * @return if the deadline is over or not
     */
    public boolean isDeadline() {
        return mIsDeadline;
    }
}
