package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.audacity.R;
import com.example.android.audacity.adapter_view.Card;
import com.example.android.audacity.adapter_view.HomeCardAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View rootView;
    ArrayList<Card> homeCards;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_home, container, false);

        //Generate Dummy ArrayList
        dummyArrayList();

        //Create an instance of HomeCardAdapter
        HomeCardAdapter adapter = new HomeCardAdapter(getActivity(), homeCards);
        //Find the ListView to set the Adapter onto
        ListView homeListView = rootView.findViewById(R.id.home_list_view);
        //Setting the Adapter
        homeListView.setAdapter(adapter);
        return rootView;
    }

    private void dummyArrayList() {
        homeCards = new ArrayList<>();
        homeCards.add(new Card(
                "Hottest App of the Day",
                "App Name",
                "Student Name",
                "Posted On 20-04-2018"));
        homeCards.add(new Card(
                "Challenges",
                "Challenge Name",
                "Moderator Name",
                "End Date: 20-04-2017"));
        homeCards.add(new Card(
                "Quizzes",
                "Quiz Name",
                "Moderator Name",
                "End Date: 20-04-2017"));
        homeCards.add(new Card(
                "Results",
                "Quiz/Challenge Name",
                "Moderator Name",
                "Posted On 20-04-2018"));
    }
}
