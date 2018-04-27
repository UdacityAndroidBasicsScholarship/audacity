package com.example.android.audacity.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.audacity.R;

public class ChallengesViewHolder extends RecyclerView.ViewHolder {

    ImageView mProfileImage;
    TextView mChallengeName;
    TextView mModeratorName;
    TextView mEndDate;

    ChallengesViewHolder(View itemView) {
        super(itemView);
        mProfileImage = itemView.findViewById(R.id.profile_image);
        mChallengeName = itemView.findViewById(R.id.header_text);
        mModeratorName = itemView.findViewById(R.id.sub_text);
        mEndDate = itemView.findViewById(R.id.date_text);
    }
}
