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

    /**
     * Constructor
     *
     * @param name        of the post
     * @param description of the post
     * @param url         related to the post
     */
    public Home(String name, String description, String url) {
        mName = name;
        mDescription = description;
        mUrl = url;
    }

    /**
     * @return the name of the post
     */
    public String getName() {
        return mName;
    }

    /**
     * @return the description of the post
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * @return the URL related to the post
     */
    public String getUrl() {
        return mUrl;
    }
}
