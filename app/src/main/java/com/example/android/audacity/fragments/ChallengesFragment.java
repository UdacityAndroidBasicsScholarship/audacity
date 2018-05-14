package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.android.audacity.R;
import com.example.android.audacity.adapters.ChallengesAdapter;
import com.example.android.audacity.pojo.Challenge;
import com.example.android.audacity.pojo.Challenge;
import com.example.android.audacity.utilities.Constants;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChallengesFragment extends Fragment {

    private static  final  String CHALLENGES_TAG = ChallengesFragment.class.getSimpleName();
    private ProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private ChallengesAdapter mChallengeAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Challenge> mChallengesData;
    private FirebaseDatabase mFirebaseDb;
    private DatabaseReference mDbRef;
    private View mRootView;

    public ChallengesFragment() {
        mFirebaseDb = FirebaseDatabase.getInstance();
        mDbRef = mFirebaseDb.getReference(Constants.CHALLENGES_STRING);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_challenges, container, false);
        mProgressBar = mRootView.findViewById(R.id.challenge_progress_bar);
        mRecyclerView = mRootView.findViewById(R.id.challenge_recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        mChallengesData = new ArrayList<>();
        mChallengeAdapter = new ChallengesAdapter(mChallengesData, getContext());

       return mRootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mChallengeAdapter);
        setChallengesData();
    }

    private void setChallengesData() {
        mProgressBar.setVisibility(View.VISIBLE);
        mDbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Challenge challenge = snapshot.getValue(Challenge.class);
                    mChallengesData.add(challenge);
                }
                mProgressBar.setVisibility(View.INVISIBLE);
                mChallengeAdapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(CHALLENGES_TAG, "loadPost:onCancelled", databaseError.toException());
            }
        });
    }

}
