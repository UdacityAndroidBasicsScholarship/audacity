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

    /**
     * Constructor
     *
     * @param hottestAppName        name of the hottest app
     * @param hottestAppDescription description of the hottest app
     * @param url                   github link of the hottest app
     */
    public HottestApp(String hottestAppName, String hottestAppDescription, String url) {
        mHottestAppName = hottestAppName;
        mHottestAppDescription = hottestAppDescription;
        mUrl = url;
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
}
