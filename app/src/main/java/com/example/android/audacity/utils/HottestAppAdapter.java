package com.example.android.audacity.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.audacity.R;
import com.example.android.audacity.models.HottestAppModel;

import java.util.ArrayList;

public class HottestAppAdapter extends RecyclerView.Adapter<HottestAppAdapter.HottestAppViewHolder> {

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
        //uncomment or replace below line with Glide image loading logic
        /*Glide.with(holder.mProfileImage.getContext()).load(appModel.getmProfileImageUrl())
                .into(holder.mProfileImage);*/
        holder.mAppName.setText(appModel.getmAppName());
        holder.mStudentName.setText(appModel.getmStudentName());
        holder.mPostedDate.setText(appModel.getmPostedDate());
    }

    @Override
    public int getItemCount() {
        return mAppList.size();
    }

    class HottestAppViewHolder extends RecyclerView.ViewHolder {

        ImageView mProfileImage;
        TextView mAppName;
        TextView mStudentName;
        TextView mPostedDate;

        HottestAppViewHolder(View itemView) {
            super(itemView);
            mProfileImage = itemView.findViewById(R.id.profile_image);
            mAppName = itemView.findViewById(R.id.header_text);
            mStudentName = itemView.findViewById(R.id.sub_text);
            mPostedDate = itemView.findViewById(R.id.date_text);
        }
    }
}
