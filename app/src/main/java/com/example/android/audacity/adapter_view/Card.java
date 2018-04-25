package com.example.android.audacity.adapter_view;

//Serves as a data type for Adapter for Home Card
public class Card {
    private String mHomeCardHeading, mCardTitle, mCardAuthor, mCardDate;

    //For Home Fragment
    public Card(String HomeCardHeading, String cardTitle, String cardAuthor,
                String cardDate) {
        mHomeCardHeading = HomeCardHeading;
        mCardTitle = cardTitle;
        mCardAuthor = cardAuthor;
        mCardDate = cardDate;
    }

    //For Other Individual Fragments
    public Card(String HomeCardTitle, String HomeCardAuthor,
                String HomeCardDate) {
        mCardTitle = HomeCardTitle;
        mCardAuthor = HomeCardAuthor;
        mCardDate = HomeCardDate;
    }

    //Getter Methods
    public String getHomeCardHeading() {
        return mHomeCardHeading;
    }

    public String getCardTitle() {
        return mCardTitle;
    }

    public String getCardAuthor() {
        return mCardAuthor;
    }

    public String getCardDate() {
        return mCardDate;
    }
}
