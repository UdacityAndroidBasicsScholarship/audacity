package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.QuizzesFragment}
 */

public class Quiz {
    // Name of the quiz
    private String mQuizName;
    // URL of the google form for the quiz
    private String mUrl;
    // Start date of the quiz
    private String mStartDate;
    // End date of the quiz
    private String mEndDate;
    // Is the deadline over?
    private boolean mIsDeadline;

    public Quiz(){}

    /**
     * @param quizName name of the quiz
     * @param url      of the google form for the quiz
     * @param startDate of the quiz
     * @param endDate   of the quiz
     * @param isDeadline if the deadline is over for the quiz     */

    public Quiz(String quizName, String url, String startDate, String endDate, boolean isDeadline) {
        mQuizName = quizName;
        mUrl = url;
        mStartDate = startDate;
        mEndDate = endDate;
        mIsDeadline = isDeadline;
    }

    /**
     * @return the name of the quiz
     */
    public String getmQuizName() {
        return mQuizName;
    }

    /**
     * @return the url of the google form for the quiz
     */
    public String getmUrl() {
        return mUrl;
    }

    /**
     * @return the start date of the quiz
     */
    public String getmStartDate() {
        return mStartDate;
    }

    /**
     * @return the end date of the quiz
     */
    public String getmEndDate() {
        return mEndDate;
    }

    /**
     * @return if the deadline is over or not.
     */
    public boolean ismIsDeadline() {
        return mIsDeadline;
    }

    public void setmQuizName(String mQuizName) {
        this.mQuizName = mQuizName;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public void setmStartDate(String mStartDate) {
        this.mStartDate = mStartDate;
    }

    public void setmEndDate(String mEndDate) {
        this.mEndDate = mEndDate;
    }

    public void setmIsDeadline(boolean mIsDeadline) {
        this.mIsDeadline = mIsDeadline;
    }
}
