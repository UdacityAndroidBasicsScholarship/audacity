package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.DashboardActivity;
import com.example.android.audacity.R;
import com.example.android.audacity.models.HomeModel;
import com.example.android.audacity.utils.HomeAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private ArrayList<HomeModel> mHomeItemsList;
    private RecyclerView mRecyclerView;


    public HomeFragment() {
        // Required empty public constructor
        setUpHomeData();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View homeFragment = inflater.inflate(R.layout.fragment_home, container, false);
        HomeAdapter homeAdapter = new HomeAdapter(getContext(), mHomeItemsList);
        mRecyclerView = homeFragment.findViewById(R.id.recycler_view);
        //set up layout for RecyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setHasFixedSize(true);
        //set the data adapter
        mRecyclerView.setAdapter(homeAdapter);
        return homeFragment;
    }

    private void setUpHomeData() {
        mHomeItemsList = new ArrayList<>();
        String[] categories = DashboardActivity.mCategoriesArray;
        for(int i = 0; i<categories.length; i++) {
            mHomeItemsList.add(new HomeModel(categories[i], R.mipmap.ic_launcher_round,
                    "Header Text", "Sub Text",
                    "Date " + new SimpleDateFormat("dd-MM-yyyy",
                            Locale.getDefault()).format(new Date())));
        }
    }

}
