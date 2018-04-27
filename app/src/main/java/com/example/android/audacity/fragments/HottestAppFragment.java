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
import com.example.android.audacity.models.HottestAppModel;
import com.example.android.audacity.utils.HottestAppAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class HottestAppFragment extends Fragment {

    private ArrayList<HottestAppModel> mAppList;
    private RecyclerView mRecyclerView;


    public HottestAppFragment() {
        // Required empty public constructor
        setUpHottestAppData();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View appFragment =  inflater.inflate(R.layout.fragment_hottest_app, container,
                false);
        HottestAppAdapter appAdapter = new HottestAppAdapter(getContext(), mAppList);
        mRecyclerView = appFragment.findViewById(R.id.recycler_view);
        //set up layout for RecyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setHasFixedSize(true);
        //set the data adapter
        mRecyclerView.setAdapter(appAdapter);
        return appFragment;
    }

    //dummy data setup which will be replaced with data from DB later
    private void setUpHottestAppData() {
        mAppList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            mAppList.add(new HottestAppModel(R.mipmap.ic_launcher_round,
                    "App Name", "Student Name",
                    "Posted Date " + new SimpleDateFormat("dd-MM-yyyy",
                            Locale.getDefault()).format(new Date())));
        }
    }

}
