package com.example.android.audacity.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.R;
import com.example.android.audacity.models.HottestAppModel;

import java.util.ArrayList;

public class HottestAppAdapter extends RecyclerView.Adapter<HottestAppViewHolder> {

    private Context mContext;
    private ArrayList<HottestAppModel> mAppList;

    public HottestAppAdapter(Context context, ArrayList<HottestAppModel> appList) {
        this.mContext = context;
        this.mAppList = appList;
    }

    @NonNull
    @Override
    public HottestAppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View appView = LayoutInflater.from(mContext)
                .inflate(R.layout.individual_fragment_item_layout, parent, false);
        return new HottestAppViewHolder(appView);
    }

    @Override
    public void onBindViewHolder(@NonNull HottestAppViewHolder holder, int position) {
        HottestAppModel appModel = mAppList.get(position);
        holder.mProfileImage.setBackgroundResource(appModel.getmProfileImageId());
        holder.mAppName.setText(appModel.getmAppName());
        holder.mStudentName.setText(appModel.getmStudentName());
        holder.mPostedDate.setText(appModel.getmPostedDate());
    }

    @Override
    public int getItemCount() {
        return mAppList.size();
    }
}
