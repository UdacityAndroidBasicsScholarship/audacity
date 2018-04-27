package com.example.android.audacity.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.audacity.R;

public class HottestAppViewHolder extends RecyclerView.ViewHolder {

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
