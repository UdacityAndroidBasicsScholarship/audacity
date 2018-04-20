package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.audacity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View rootView, hottestAppCardHeadingView, challengesCardHeadingView, quizzesCardHeadingView,
            resultsCardHeadingView, hottestAppCardView, challengesCardView, quizzesCardView,
            resultsCardView;
    TextView hottestAppHeadingTextView, challengesHeadingTextView, quizzesHeadingTextView,
            resultsHeadingTextView, hottestAppCardTitleTextView, challengesCardTitleTextView,
            quizzesCardTitleTextView, resultsCardTitleTextView, hottestAppCardSubTitleTextView,
            challengesCardSubTitleTextView, quizzesCardSubTitleTextView, resultsCardSubTitleTextView,
            hottestAppCardDescriptionTextView, challengesCardDescriptionTextView,
            quizzesCardDescriptionTextView, resultsCardDescriptionTextView;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_home, container, false);

        setHeadings(); //Sets Text Headings for views like Hottest App of the Day, Challenges, etc.
        initiateCardViews(); //Cards Contain Titles, SubTitles & Description mentioned below
        setCardTitles(); //Sets the Text Titles for each Card
        setCardSubTitles(); //Set the Moderator or Student Names
        setCardDescriptions(); //Set the End Date and Posted on Dates

        return rootView;
    }

    private void setHeadings() {
        //Find All Heading Views
        hottestAppCardHeadingView = rootView.findViewById(R.id.home_card_heading_hottest_app);
        challengesCardHeadingView = rootView.findViewById(R.id.home_card_heading_challenges);
        quizzesCardHeadingView = rootView.findViewById(R.id.home_card_heading_quizzes);
        resultsCardHeadingView = rootView.findViewById(R.id.home_card_heading_results);

        //Find Corresponding TextViews for each Heading Views above
        hottestAppHeadingTextView = hottestAppCardHeadingView.findViewById(R.id.card_heading);
        challengesHeadingTextView = challengesCardHeadingView.findViewById(R.id.card_heading);
        quizzesHeadingTextView = quizzesCardHeadingView.findViewById(R.id.card_heading);
        resultsHeadingTextView = resultsCardHeadingView.findViewById(R.id.card_heading);

        //Set Corresponding Titles to the above Heading TextViews
        hottestAppHeadingTextView.setText(R.string.hottest_app_of_day);
        challengesHeadingTextView.setText(R.string.challenges);
        quizzesHeadingTextView.setText(R.string.quizzes);
        resultsHeadingTextView.setText(R.string.results);
    }

    private void initiateCardViews() {
        //Find All Cards View
        hottestAppCardView = rootView.findViewById(R.id.home_card_hottest_app);
        challengesCardView = rootView.findViewById(R.id.home_card_challenges);
        quizzesCardView = rootView.findViewById(R.id.home_card_quizzes);
        resultsCardView = rootView.findViewById(R.id.home_card_results);
    }

    private void setCardTitles() {
        //TITLE
        //Find Corresponding Title TextViews for each Card above
        hottestAppCardTitleTextView = hottestAppCardView.findViewById(R.id.home_card_title);
        challengesCardTitleTextView = challengesCardView.findViewById(R.id.home_card_title);
        quizzesCardTitleTextView = quizzesCardView.findViewById(R.id.home_card_title);
        resultsCardTitleTextView = resultsCardView.findViewById(R.id.home_card_title);

        //Set Corresponding Titles to the above Heading TextViews
        hottestAppCardTitleTextView.setText("App Name");
        challengesCardTitleTextView.setText("Challenge Name");
        quizzesCardTitleTextView.setText("Quiz Name");
        resultsCardTitleTextView.setText("Quiz/Challenge Name");
    }

    private void setCardSubTitles() {
        //STUDENT / MODERATOR NAME
        //Find Corresponding Sub-Title TextViews for each Card above
        hottestAppCardSubTitleTextView = hottestAppCardView.findViewById(R.id.home_card_subtitle);
        challengesCardSubTitleTextView = challengesCardView.findViewById(R.id.home_card_subtitle);
        quizzesCardSubTitleTextView = quizzesCardView.findViewById(R.id.home_card_subtitle);
        resultsCardSubTitleTextView = resultsCardView.findViewById(R.id.home_card_subtitle);

        //Set Corresponding Student or Moderator Name to the above Sub-Title TextViews
        hottestAppCardSubTitleTextView.setText("Student Name");
        challengesCardSubTitleTextView.setText("Moderator Name");
        quizzesCardSubTitleTextView.setText("Moderator Name");
        resultsCardSubTitleTextView.setText("Moderator Name");
    }

    private void setCardDescriptions() {
        //DATES
        //Find Corresponding Sub-Title TextViews for each Card above
        hottestAppCardDescriptionTextView = hottestAppCardView.findViewById(R.id.home_card_description);
        challengesCardDescriptionTextView = challengesCardView.findViewById(R.id.home_card_description);
        quizzesCardDescriptionTextView = quizzesCardView.findViewById(R.id.home_card_description);
        resultsCardDescriptionTextView = resultsCardView.findViewById(R.id.home_card_description);

        //Set Corresponding Student or Moderator Name to the above Sub-Title TextViews
        hottestAppCardDescriptionTextView.setText("Posted on 20-04-2018");
        challengesCardDescriptionTextView.setText("End Date: 20-04-2018");
        quizzesCardDescriptionTextView.setText("End Date: 20-04-2018");
        resultsCardDescriptionTextView.setText("Posted on 20-04-2018");
    }
}
