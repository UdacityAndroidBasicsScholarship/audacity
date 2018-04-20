package com.example.android.audacity.pojo;

import java.util.ArrayList;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.ResultsFragment}
 */

public class Result {
    // Name of the event
    private String mEventName;
    // Description of the event
    private String mEventDescription;
    // List of the winners
    private ArrayList<String> mWinners;
    // Link to the github url of the project if applicable
    private ArrayList<String> mProjectUrls;

    /**
     * Constructor for the results of projects
     *
     * @param eventName        name of the event
     * @param eventDescription description of the event
     * @param winners          of the event
     */
    public Result(String eventName, String eventDescription, ArrayList<String> winners, ArrayList<String> projectUrls) {
        mEventName = eventName;
        mEventDescription = eventDescription;
        mWinners = winners;
        mProjectUrls = projectUrls;
    }

    /**
     * Constructor for the results of non-project activites(like quizzes)
     *
     * @param mEventName        name of the event
     * @param mEventDescription description of the event
     * @param mWinners          winners of the event
     */
    public Result(String mEventName, String mEventDescription, ArrayList<String> mWinners) {
        this.mEventName = mEventName;
        this.mEventDescription = mEventDescription;
        this.mWinners = mWinners;
    }

    /**
     * @return the name of the event
     */
    public String getEventName() {
        return mEventName;
    }

    /**
     * @return the description of the event
     */
    public String getEventDescription() {
        return mEventDescription;
    }

    /**
     * @return the winners of the event
     */
    public ArrayList<String> getWinners() {
        return mWinners;
    }

    /**
     * @return the urls of the projects of the winners
     */
    public ArrayList<String> getProjectUrls() {
        return mProjectUrls;
    }
}
