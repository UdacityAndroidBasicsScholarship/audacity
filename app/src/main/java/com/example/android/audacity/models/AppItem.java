package com.example.android.audacity.models;

public class AppItem {
    private int appIcon;
    private String title, subTitle, dateCreated;

    public AppItem(int appIcon, String title, String subTitle, String dateCreated) {
        this.appIcon=appIcon;
        this.title=title;
        this.subTitle=subTitle;
        this.dateCreated=dateCreated;
    }

    public int getAppIcon() {
        return appIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDateCreated() {
        return dateCreated;
    }
}
