package com.example.android.audacity.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.R;
import com.example.android.audacity.models.HomeModel;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    private Context mContext;
    private ArrayList<HomeModel> mHomeItemsList;

    public HomeAdapter(Context context, ArrayList<HomeModel> homeItemsList) {
        this.mContext = context;
        this.mHomeItemsList = homeItemsList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View homeView = LayoutInflater.from(mContext)
                .inflate(R.layout.home_fragment_item_layout, parent, false);
        return new HomeViewHolder(homeView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        HomeModel homeModel = mHomeItemsList.get(position);
        holder.mCategory.setText(homeModel.getmCategory());
        holder.mProfileImage.setBackgroundResource(homeModel.getmProfileImageId());
        holder.mHeaderText.setText(homeModel.getmHeaderText());
        holder.mSubText.setText(homeModel.getmSubText());
        holder.mDateText.setText(homeModel.getmDateText());
    }

    @Override
    public int getItemCount() {
        return mHomeItemsList.size();
    }
}
