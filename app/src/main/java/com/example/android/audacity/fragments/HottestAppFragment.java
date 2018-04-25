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
import com.example.android.audacity.adapter_view.HomeCard;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HottestAppFragment extends Fragment {

    private View rootView;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<HomeCard> cards;
    public HottestAppFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_hottest_app, container, false);
        mRecyclerView = rootView.findViewById(R.id.hottest_app_recycler_view);

        mRecyclerView.setHasFixedSize(true); //Do not use if layout (Card) size changes based on content

        //Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Set Adapter
        mAdapter = new FragmentsAdapter(generateDummyData());
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

    private List<HomeCard> generateDummyData() {
        cards = new ArrayList<>();
        cards.add(new HomeCard(
                "App Name 1",
                "Student Name",
                "Posted On 20-04-2018"));
        cards.add(new HomeCard(
                "App Name 2",
                "Student Name",
                "Posted On 19-04-2018"));
        cards.add(new HomeCard(
                "App Name 3",
                "Student Name",
                "Posted On 18-04-2018"));
        cards.add(new HomeCard(
                "App Name 4",
                "Student Name",
                "Posted On 17-04-2018"));
        cards.add(new HomeCard(
                "App Name 5",
                "Student Name",
                "Posted On 16-04-2018"));
        cards.add(new HomeCard(
                "App Name 6",
                "Student Name",
                "Posted On 15-04-2018"));
        cards.add(new HomeCard(
                "App Name 7",
                "Student Name",
                "Posted On 14-04-2018"));
        cards.add(new HomeCard(
                "App Name 8",
                "Student Name",
                "Posted On 13-04-2018"));
        cards.add(new HomeCard(
                "App Name 9",
                "Student Name",
                "Posted On 12-04-2018"));
        cards.add(new HomeCard(
                "App Name 10",
                "Student Name",
                "Posted On 11-04-2018"));
        cards.add(new HomeCard(
                "App Name 11",
                "Student Name",
                "Posted On 10-04-2018"));
        cards.add(new HomeCard(
                "App Name 12",
                "Student Name",
                "Posted On 09-04-2018"));

        return cards;
    }
}
