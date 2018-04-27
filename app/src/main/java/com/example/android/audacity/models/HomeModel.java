package com.example.android.audacity.models;

public class HomeModel {

    private String mCategory;
    private int mProfileImageId;
    private String mHeaderText;
    private String mSubText;
    private String mDateText;

    public HomeModel(String category, int profileImageId, String headerText, String subText, String dateText) {
        this.mCategory = category;
        this.mProfileImageId = profileImageId;
        this.mHeaderText = headerText;
        this.mSubText = subText;
        this.mDateText = dateText;
    }

    public String getmCategory() {
        return mCategory;
    }

    public int getmProfileImageId() {
        return mProfileImageId;
    }

    public String getmHeaderText() {
        return mHeaderText;
    }

    public String getmSubText() {
        return mSubText;
    }

    public String getmDateText() {
        return mDateText;
    }
}
