package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.HottestAppFragment}
 */

public class HottestApp {
    // Name of the hottest app
    private String mHottestAppName;
    // Description of the hottest app
    private String mHottestAppDescription;
    // Github URL of the app
    private String mUrl;
    // Date of upload of the app
    private String mDate;

    /**
     * Constructor
     *
     * @param hottestAppName        name of the hottest app
     * @param hottestAppDescription description of the hottest app
     * @param url                   github link of the hottest app
     * @param date                  date of the app upload
     */
    public HottestApp(String hottestAppName, String hottestAppDescription, String url, String date) {
        mHottestAppName = hottestAppName;
        mHottestAppDescription = hottestAppDescription;
        mUrl = url;
        mDate = date;
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
}
