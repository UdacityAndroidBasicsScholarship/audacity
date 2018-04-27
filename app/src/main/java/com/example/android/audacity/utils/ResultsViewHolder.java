package com.example.android.audacity.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.audacity.R;

public class ResultsViewHolder extends RecyclerView.ViewHolder {

    ImageView mProfileImage;
    TextView mQuiz_ChallengeName;
    TextView mModeratorName;
    TextView mPostedDate;

    ResultsViewHolder(View itemView) {
        super(itemView);
        mProfileImage = itemView.findViewById(R.id.profile_image);
        mQuiz_ChallengeName = itemView.findViewById(R.id.header_text);
        mModeratorName = itemView.findViewById(R.id.sub_text);
        mPostedDate = itemView.findViewById(R.id.date_text);
    }
}
