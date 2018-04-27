package com.example.android.audacity.models;

public class HottestAppModel {

    private String mProfileImageUrl;
    private String mAppName;
    private String mStudentName;
    private String mPostedDate;

    public HottestAppModel(String profileImageId, String appName, String studentName, String postedDate) {
        this.mProfileImageUrl = profileImageId;
        this.mAppName = appName;
        this.mStudentName = studentName;
        this.mPostedDate = postedDate;
    }

    //constructor with no profile image - can be removed later
    public HottestAppModel(String mAppName, String mStudentName, String mPostedDate) {
        this.mAppName = mAppName;
        this.mStudentName = mStudentName;
        this.mPostedDate = mPostedDate;
    }

    public String getmProfileImageUrl() {
        return mProfileImageUrl;
    }

    public String getmAppName() {
        return mAppName;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public String getmPostedDate() {
        return mPostedDate;
    }
}
