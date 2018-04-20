package com.example.android.audacity.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.android.audacity.R;
<<<<<<< HEAD
import com.example.android.audacity.RecyclerViewAdapter;
import com.example.android.audacity.RecyclerViewHelper;
import com.example.android.audacity.adapters.AppAdapter;
import com.example.android.audacity.models.AppItem;
=======
import com.example.android.audacity.utils.RecyclerViewAdapter;
import com.example.android.audacity.utils.RecyclerViewHelper;
>>>>>>> 2936cf569da0fea49b01c5a1ff2b48658fb7803e

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HottestAppFragment extends Fragment {

    //recycler view utilities
    private ArrayList<AppItem> items = new ArrayList<>();
    private RecyclerView recyclerView;
    //private RecyclerViewAdapter mAdapter;
    private AppAdapter appAdapter;
    private TextView mTextViewEmpty;
    private ImageView mImageViewEmpty;
    private ProgressBar mProgressBarLoading;

    public HottestAppFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quizzes, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mTextViewEmpty = (TextView) view.findViewById(R.id.textViewEmpty);
        mImageViewEmpty = (ImageView) view.findViewById(R.id.imageViewEmpty);
        mProgressBarLoading = (ProgressBar) view.findViewById(R.id.progressBarLoading);
        prepareFakeData();
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
<<<<<<< HEAD
        appAdapter=new AppAdapter(items);
        recyclerView.setAdapter(appAdapter);
        //mAdapter = new RecyclerViewAdapter(myList);
        //recyclerView.setAdapter(mAdapter);
        return view;    }



    public void prepareFakeData() {
        for(int i=0;i<10;++i){
            items.add(new AppItem(R.drawable.profile,"App "+(i+1)+" Title","Developed By - Developer"+(i+1),"20/04/2018"));
        }
=======
        mAdapter = new RecyclerViewAdapter(myList);
        recyclerView.setAdapter(mAdapter);
        return view;
    }


    public void prepareFakeData() {
        RecyclerViewHelper item = new RecyclerViewHelper(R.drawable.profile, "App Name", "Dont know", "12-12-12");
        myList.add(item);
        item = new RecyclerViewHelper(R.drawable.profile, "App Name", "Dont know", "12-12-12");
        myList.add(item);
>>>>>>> 2936cf569da0fea49b01c5a1ff2b48658fb7803e
    }

}
