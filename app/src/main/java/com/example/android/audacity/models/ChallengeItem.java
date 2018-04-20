package com.example.android.audacity.models;

public class ChallengeItem {

    private int challengeIcon;
    private String title, subTitle, dateCreated;

    public ChallengeItem(int challengeIcon, String title, String subTitle, String dateCreated) {
        this.challengeIcon=challengeIcon;
        this.title=title;
        this.subTitle=subTitle;
        this.dateCreated=dateCreated;
    }

    public int getChallengeIcon() {
        return challengeIcon;
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
