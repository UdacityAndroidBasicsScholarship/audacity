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
            resultsCardHeadingView;
    TextView hottestAppHeadingTextView, challengesHeadingTextView, quizzesHeadingTextView,
            resultsHeadingTextView;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_home, container, false);

        setHeadings(); //Sets Text Headings for views like Hottest App of the Day, Challenges, etc.

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
}
