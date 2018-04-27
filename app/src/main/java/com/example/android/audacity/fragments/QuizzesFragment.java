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
import com.example.android.audacity.models.QuizzesModel;
import com.example.android.audacity.utils.QuizzesAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuizzesFragment extends Fragment {

    private ArrayList<QuizzesModel> mQuizList;
    private RecyclerView mRecyclerView;


    public QuizzesFragment() {
        // Required empty public constructor
        setUpQuizzesData();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View quizFragment = inflater.inflate(R.layout.fragment_quizzes, container, false);
        QuizzesAdapter quizAdapter = new QuizzesAdapter(getContext(), mQuizList);
        mRecyclerView = quizFragment.findViewById(R.id.recycler_view);
        //set up layout for RecyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setHasFixedSize(true);
        //set the data adapter
        mRecyclerView.setAdapter(quizAdapter);
        return quizFragment;
    }

    //dummy data setup which will be replaced with data from DB later
    private void setUpQuizzesData() {
        mQuizList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            mQuizList.add(new QuizzesModel("Quiz Name", "Mod Name",
                    "End Date " + new SimpleDateFormat("dd-MM-yyyy",
                            Locale.getDefault()).format(new Date())));
        }
    }

}
