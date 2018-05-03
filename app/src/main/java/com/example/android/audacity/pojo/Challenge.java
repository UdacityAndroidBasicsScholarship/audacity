package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.ChallengesFragment}
 */

public class Challenge {
    // Time stamp for the challenge
    private String mTimeStamp;
    // Moderator name
    private String mModeratorName;
    // Moderator email address
    private String mEmail;
    // Moderator slack id
    private String mSlackId;
    // Variable to store the challenge name
    private String mChallengeName;
    // Variable to store the challenge description
    private String mChallengeDescription;
    // Reference Url
    private String mReferenceUrl;
    // Image link
    private String mImageUrl;
    // Video link
    private String mVideoUrl;
    // starting date of the challenge
    private String mStartDate;
    // ending date of the challenge
    private String mEndDate;
    // variable to see if the deadline is crossed
    private boolean mIsDeadline;
    // check if the project is approved
    private boolean mIsApproved;

    /**
     * Constructor
     *
     * @param timeStamp            time and date of upload
     * @param moderatorName        name of the moderator
     * @param email                email of the moderator
     * @param slackId              slack Id of the moderator
     * @param challengeName        name of the challenge
     * @param challengeDescription description of the challenge
     * @param referenceUrl         reference url for the challenge
     * @param imageUrl             image url of the challenge
     * @param videoUrl             video url of the challenge
     * @param startDate            start date of the challenge
     * @param endDate              end date of the challenge
     * @param isDeadline           is the deadline over or not
     * @param isApproved           is the project approved
     */
    public Challenge(String timeStamp, String moderatorName, String email, String slackId,
                     String challengeName, String challengeDescription, String referenceUrl,
                     String imageUrl, String videoUrl, String startDate, String endDate,
                     boolean isDeadline, boolean isApproved) {
        mTimeStamp = timeStamp;
        mModeratorName = moderatorName;
        mEmail = email;
        mSlackId = slackId;
        mChallengeName = challengeName;
        mChallengeDescription = challengeDescription;
        mReferenceUrl = referenceUrl;
        mImageUrl = imageUrl;
        mVideoUrl = videoUrl;
        mStartDate = startDate;
        mEndDate = endDate;
        mIsDeadline = isDeadline;
        mIsApproved = isApproved;
    }

    /**
     * @return the time stamp of the challenge
     */
    public String getTimeStamp() {
        return mTimeStamp;
    }

    /**
     * @return the moderator name
     */
    public String getModeratorName() {
        return mModeratorName;
    }

    /**
     * @return the email id of the moderator
     */
    public String getEmail() {
        return mEmail;
    }

    /**
     * @return the slack id of the challenge
     */
    public String getSlackId() {
        return mSlackId;
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
     * @return the reference url for the challenge
     */
    public String getReferenceUrl() {
        return mReferenceUrl;
    }

    /**
     * @return the image url of the challenge
     */
    public String getImageUrl() {
        return mImageUrl;
    }

    /**
     * @return the video url of the challenge
     */
    public String getVideoUrl() {
        return mVideoUrl;
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

    /**
     * @return if the project is approved or not
     */
    public boolean isApproved() {
        return mIsApproved;
    }
}
