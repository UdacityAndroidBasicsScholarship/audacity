package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.R;
import com.example.android.audacity.adapter_view.FragmentsAdapter;
import com.example.android.audacity.adapter_view.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChallengesFragment extends Fragment {

    private View rootView;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Card> cards;

    public ChallengesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_challenges, container, false);
        mRecyclerView = rootView.findViewById(R.id.challenges_recycler_view);

        mRecyclerView.setHasFixedSize(true); //Do not use if layout (Card) size changes based on content

        //Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Set Adapter
        mAdapter = new FragmentsAdapter(generateDummyData());
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

    private List<Card> generateDummyData() {
        cards = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            cards.add(new Card(
                    "Challenge Name " + i,
                    "Moderator Name",
                    "Posted On " + String.valueOf(21 - i) + "-04-2018"));
        }
        return cards;
    }
}
