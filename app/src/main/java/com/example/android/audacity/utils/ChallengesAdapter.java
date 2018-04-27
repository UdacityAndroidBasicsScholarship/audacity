package com.example.android.audacity.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.R;
import com.example.android.audacity.models.ChallengesModel;

import java.util.ArrayList;

public class ChallengesAdapter extends RecyclerView.Adapter<ChallengesViewHolder> {

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
        holder.mProfileImage.setBackgroundResource(challengesModel.getmProfileImageId());
        holder.mChallengeName.setText(challengesModel.getmChallengeName());
        holder.mModeratorName.setText(challengesModel.getmModeratorName());
        holder.mEndDate.setText(challengesModel.getmEndDate());
    }

    @Override
    public int getItemCount() {
        return mChallengesList.size();
    }
}
