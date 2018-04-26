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
    // Date of the held event
    private String mDateOfEvent;
    // Date of the result announcement
    private String mDateOfAnnouncement;

    /**
     * Constructor for the results of challenges
     *
     * @param eventName        name of the event
     * @param eventDescription description of the event
     * @param winners          of the event
     * @param dateOfEvent      date of the event
     * @param dateOfAnnouncement date of announcement of the result
     */
    public Result(String eventName, String eventDescription, ArrayList<String> winners, ArrayList<String> projectUrls,
                  String dateOfEvent, String dateOfAnnouncement) {
        mEventName = eventName;
        mEventDescription = eventDescription;
        mWinners = winners;
        mProjectUrls = projectUrls;
        mDateOfEvent = dateOfEvent;
        mDateOfAnnouncement = dateOfAnnouncement;
    }

    /**
     * Constructor for the results of non-project activites(like quizzes)
     *
     * @param eventName        name of the event
     * @param eventDescription description of the event
     * @param winners          winners of the event
     * @param dateOfEvent      date of the event
     * @param dateOfAnnouncement date of announcement of the result
     */
    public Result(String eventName, String eventDescription, ArrayList<String> winners,
                  String dateOfEvent, String dateOfAnnouncement) {
        mEventName = eventName;
        mEventDescription = eventDescription;
        mWinners = winners;
        mDateOfEvent = dateOfEvent;
        mDateOfAnnouncement = dateOfAnnouncement;
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
