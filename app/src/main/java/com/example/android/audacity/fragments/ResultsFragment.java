package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.R;
import com.example.android.audacity.models.ResultsModel;
import com.example.android.audacity.utils.ResultsAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultsFragment extends Fragment {

    private ArrayList<ResultsModel> mChallengesList;
    private RecyclerView mRecyclerView;


    public ResultsFragment() {
        // Required empty public constructor
        setUpResultsData();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View resultFragment = inflater.inflate(R.layout.fragment_results, container, false);
        ResultsAdapter resultAdapter = new ResultsAdapter(getContext(), mChallengesList);
        mRecyclerView = resultFragment.findViewById(R.id.recycler_view);
        //set up layout for RecyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setHasFixedSize(true);
        //set the data adapter
        mRecyclerView.setAdapter(resultAdapter);
        return resultFragment;
    }

    //dummy data setup which will be replaced with data from DB later
    private void setUpResultsData() {
        mChallengesList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            mChallengesList.add(new ResultsModel("Quiz/Challenge Name", "Mod Name",
                    new SimpleDateFormat("dd-MM-yyyy",
                            Locale.getDefault()).format(new Date())));
        }
    }

}
