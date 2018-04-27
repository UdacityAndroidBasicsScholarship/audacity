package com.example.android.audacity.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.audacity.R;

public class HomeViewHolder extends RecyclerView.ViewHolder {

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
