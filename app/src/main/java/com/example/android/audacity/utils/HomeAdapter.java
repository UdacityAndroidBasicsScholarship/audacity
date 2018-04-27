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
import com.example.android.audacity.models.HomeModel;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

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
        //uncomment or replace below line with Glide image loading logic
        /*Glide.with(holder.mProfileImage.getContext()).load(homeModel.getmProfileImageUrl())
                .into(holder.mProfileImage);*/
        holder.mHeaderText.setText(homeModel.getmHeaderText());
        holder.mSubText.setText(homeModel.getmSubText());
        holder.mDateText.setText(homeModel.getmDateText());
    }

    @Override
    public int getItemCount() {
        return mHomeItemsList.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder {

        TextView mCategory;
        ImageView mProfileImage;
        TextView mHeaderText;
        TextView mSubText;
        TextView mDateText;

        HomeViewHolder(View itemView) {
            super(itemView);
            mCategory = itemView.findViewById(R.id.category);
            mProfileImage = itemView.findViewById(R.id.profile_image);
            mHeaderText = itemView.findViewById(R.id.header_text);
            mSubText = itemView.findViewById(R.id.sub_text);
            mDateText = itemView.findViewById(R.id.date_text);
        }
    }
}
