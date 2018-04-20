package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.ChallengesFragment}
 */

public class Challenge {
    // Variable to store the challenge name
    private String mChallengeName;
    // Variable to store the challenge description
    private String mChallengeDescription;

    /**
     * Constructor
     *
     * @param challengeName        name of the challenge
     * @param challengeDescription descrption of the challenge
     */
    public Challenge(String challengeName, String challengeDescription) {
        mChallengeName = challengeName;
        mChallengeDescription = challengeDescription;
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
}
