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

    /**
     * Constructor
     *
     * @param eventName        name of the event
     * @param eventDescription description of the event
     * @param winners          of the event
     */
    public Result(String eventName, String eventDescription, ArrayList<String> winners) {
        mEventName = eventName;
        mEventDescription = eventDescription;
        mWinners = winners;
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
}
