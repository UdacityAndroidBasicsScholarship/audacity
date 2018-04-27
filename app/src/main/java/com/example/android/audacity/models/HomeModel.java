package com.example.android.audacity.models;

public class HomeModel {

    private String mCategory;
    private String mProfileImageUrl;
    private String mHeaderText;
    private String mSubText;
    private String mDateText;

    public HomeModel(String category, String profileImageId, String headerText, String subText, String dateText) {
        this.mCategory = category;
        this.mProfileImageUrl = profileImageId;
        this.mHeaderText = headerText;
        this.mSubText = subText;
        this.mDateText = dateText;
    }

    //constructor with no profile image - can be removed later
    public HomeModel(String mCategory, String mHeaderText, String mSubText, String mDateText) {
        this.mCategory = mCategory;
        this.mHeaderText = mHeaderText;
        this.mSubText = mSubText;
        this.mDateText = mDateText;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmProfileImageUrl() {
        return mProfileImageUrl;
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
