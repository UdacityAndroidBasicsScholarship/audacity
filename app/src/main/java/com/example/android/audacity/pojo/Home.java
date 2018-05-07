package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.HomeFragment}
 */

public class Home {
    // Name of the post
    private String mName;
    // Description of the post
    private String mDescription;
    // URL related to the post
    private String mUrl;
    // date of the project upload
    private String mDate;

    /**
     * Constructor
     *
     * @param name        of the post
     * @param description of the post
     * @param url         related to the post
     * @param date        date of the project upload
     */
    public Home(String name, String description, String url, String date) {
        mName = name;
        mDescription = description;
        mUrl = url;
        mDate = date;
    }

    /**
     * @return the name of the post
     */
    public String getmName() {
        return mName;
    }

    /**
     * @return the description of the post
     */
    public String getmDescription() {
        return mDescription;
    }

    /**
     * @return the URL related to the post
     */
    public String getmUrl() {
        return mUrl;
    }

    /**
     * @return the date of the project upload
     */
    public String getmDate() {
        return mDate;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
