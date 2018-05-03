package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.HottestAppFragment}
 */

public class HottestApp {
    // Time and date of the upload
    private String mTimeStamp;
    // Email id of the student
    private String mEmail;
    // Name of the student
    private String mName;
    // Slack Id of the student
    private String mSlackId;
    // Name of the hottest app
    private String mHottestAppName;
    // Description of the hottest app
    private String mHottestAppDescription;
    // Url of the image of the app(Screenshot)
    private String mImageUrl;
    // Url of the video of the hottest app
    private String mVideoUrl;
    // Github URL of the app
    private String mUrl;
    // Date of upload of the app
    private String mDate;
    // is the app approved??
    private boolean mIsApproved;

    /**
     * Constructor
     *
     * @param hottestAppName        name of the hottest app
     * @param hottestAppDescription description of the hottest app
     * @param url                   github link of the hottest app
     * @param date                  date of the app upload
     */
    public HottestApp(String timeStamp, String email, String name, String slackId, String hottestAppName,
                      String hottestAppDescription, String imageUrl, String videoUrl, String url, String date,
                      boolean isApproved) {
        mTimeStamp = timeStamp;
        mEmail = email;
        mName = name;
        mSlackId = slackId;
        mHottestAppName = hottestAppName;
        mHottestAppDescription = hottestAppDescription;
        mImageUrl = imageUrl;
        mVideoUrl = videoUrl;
        mUrl = url;
        mDate = date;
        mIsApproved = isApproved;
    }

    /**
     * @return the timestamp of the hottest app
     */
    public String getTimeStamp() {
        return mTimeStamp;
    }

    /**
     * @return the email id of the student
     */
    public String getEmail() {
        return mEmail;
    }

    /**
     * @return the name of the student
     */
    public String getName() {
        return mName;
    }

    /**
     * @return the slack id of the student
     */
    public String getSlackId() {
        return mSlackId;
    }

    /**
     * @return the name of the hottest app
     */
    public String getHottestAppName() {
        return mHottestAppName;
    }

    /**
     * @return the description of the hottest app
     */
    public String getHottestAppDescription() {
        return mHottestAppDescription;
    }

    /**
     * @return the image url of the app
     */
    public String getImageUrl() {
        return mImageUrl;
    }

    /**
     * @return the video url of the app
     */
    public String getVideoUrl() {
        return mVideoUrl;
    }

    /**
     * @return github url of the hottest app
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * @return the date of the app upload
     */
    public String getDate() {
        return mDate;
    }

    /**
     * @return if the app is approved or not
     */
    public boolean isApproved() {
        return mIsApproved;
    }
}
