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
import com.example.android.audacity.models.ChallengesModel;
import com.example.android.audacity.utils.ChallengesAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChallengesFragment extends Fragment {

    private ArrayList<ChallengesModel> mChallengesList;
    private RecyclerView mRecyclerView;


    public ChallengesFragment() {
        // Required empty public constructor
        setUpChallengesData();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View challengeFragment = inflater.inflate(R.layout.fragment_challenges, container,
                false);
        ChallengesAdapter challengeAdapter = new ChallengesAdapter(getContext(), mChallengesList);
        mRecyclerView = challengeFragment.findViewById(R.id.recycler_view);
        //set up layout for RecyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setHasFixedSize(true);
        //set the data adapter
        mRecyclerView.setAdapter(challengeAdapter);
        return challengeFragment;
    }

    //dummy data setup which will be replaced with data from DB later
    private void setUpChallengesData() {
        mChallengesList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            mChallengesList.add(new ChallengesModel(R.mipmap.ic_launcher_round,
                    "Challenge Name", "Mod Name",
                    "End Date " + new SimpleDateFormat("dd-MM-yyyy",
                            Locale.getDefault()).format(new Date())));
        }
    }

}
