package com.example.android.audacity.adapter_view;

//Serves as a data type for Adapter for Home Card
public class HomeCard {
    private String mHomeCardHeading, mHomeCardTitle, mHomeCardAuthor, mHomeCardDate;

    public HomeCard(String HomeCardHeading, String HomeCardTitle, String HomeCardAuthor,
                    String HomeCardDate) {
        mHomeCardHeading = HomeCardHeading;
        mHomeCardTitle = HomeCardTitle;
        mHomeCardAuthor = HomeCardAuthor;
        mHomeCardDate = HomeCardDate;
    }

    //Getter Methods
    public String getHomeCardHeading() {
        return mHomeCardHeading;
    }

    public String getHomeCardTitle() {
        return mHomeCardTitle;
    }

    public String getHomeCardAuthor() {
        return mHomeCardAuthor;
    }

    public String getHomeCardDate() {
        return mHomeCardDate;
    }
}
