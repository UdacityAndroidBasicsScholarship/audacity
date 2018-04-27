package com.example.android.audacity.models;

public class HottestAppModel {

    private int mProfileImageId;
    private String mAppName;
    private String mStudentName;
    private String mPostedDate;

    public HottestAppModel(int profileImageId, String appName, String studentName, String postedDate) {
        this.mProfileImageId = profileImageId;
        this.mAppName = appName;
        this.mStudentName = studentName;
        this.mPostedDate = postedDate;
    }

    public int getmProfileImageId() {
        return mProfileImageId;
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
