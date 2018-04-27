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
import com.example.android.audacity.models.ChallengesModel;

import java.util.ArrayList;

public class ChallengesAdapter extends RecyclerView.Adapter<ChallengesAdapter.ChallengesViewHolder> {

    private Context mContext;
    private ArrayList<ChallengesModel> mChallengesList;

    public ChallengesAdapter(Context context, ArrayList<ChallengesModel> challengesList) {
        this.mContext = context;
        this.mChallengesList = challengesList;
    }

    @NonNull
    @Override
    public ChallengesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View challengeView = LayoutInflater.from(mContext)
                .inflate(R.layout.individual_fragment_item_layout, parent, false);
        return new ChallengesViewHolder(challengeView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChallengesViewHolder holder, int position) {
        ChallengesModel challengesModel = mChallengesList.get(position);
        //uncomment or replace below line with Glide image loading logic
        /*Glide.with(holder.mProfileImage.getContext()).load(challengesModel.getmProfileImageUrl())
                .into(holder.mProfileImage);*/
        holder.mChallengeName.setText(challengesModel.getmChallengeName());
        holder.mModeratorName.setText(challengesModel.getmModeratorName());
        holder.mEndDate.setText(challengesModel.getmEndDate());
    }

    @Override
    public int getItemCount() {
        return mChallengesList.size();
    }

    class ChallengesViewHolder extends RecyclerView.ViewHolder {

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
}
