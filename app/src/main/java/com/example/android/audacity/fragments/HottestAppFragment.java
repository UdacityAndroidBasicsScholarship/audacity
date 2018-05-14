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
import com.example.android.audacity.adapters.HottestAppAdapter;
import com.example.android.audacity.pojo.HottestApp;
import com.example.android.audacity.utilities.Constants;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.MissingResourceException;

/**
 * A simple {@link Fragment} subclass.
 */
public class HottestAppFragment extends Fragment {

    private static final String HOTTEST_APP_TAG = HottestAppFragment.class.getSimpleName();

    private ProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private HottestAppAdapter mHottestAppAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<HottestApp> mHottestAppData;
    private FirebaseDatabase mFirebaseDb;
    private DatabaseReference mDbRef;
    private View mRootView;

    public HottestAppFragment() {
        mFirebaseDb = FirebaseDatabase.getInstance();
        mDbRef = mFirebaseDb.getReference(Constants.HOTTEST_APP_STRING);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_hottest_app, container, false);
        mProgressBar = mRootView.findViewById(R.id.hottest_progress_bar);
        mRecyclerView = mRootView.findViewById(R.id.hottest_app_recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        mHottestAppData = new ArrayList<>();
        mHottestAppAdapter = new HottestAppAdapter(mHottestAppData, getContext());

        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mHottestAppAdapter);
        setHottestAppData();
    }

    private void setHottestAppData() {
        mProgressBar.setVisibility(View.VISIBLE);
        mDbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    HottestApp hottestApp = snapshot.getValue(HottestApp.class);
                    mHottestAppData.add(hottestApp);
                }
                mProgressBar.setVisibility(View.INVISIBLE);
                mHottestAppAdapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(HOTTEST_APP_TAG, "loadPost:onCancelled", databaseError.toException());
            }
        });
    }


}
