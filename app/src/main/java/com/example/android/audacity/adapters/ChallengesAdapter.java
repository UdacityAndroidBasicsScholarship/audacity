package com.example.android.audacity.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.audacity.R;
import com.example.android.audacity.pojo.Challenge;
import com.example.android.audacity.utilities.Helpers;

import java.util.ArrayList;

public class ChallengesAdapter extends RecyclerView.Adapter<ChallengesAdapter.ViewHolder> {

    private ArrayList<Challenge> mChallengeData;
    private Context mContext;

    public ChallengesAdapter(ArrayList<Challenge> mChallengeData, Context mContext) {
        this.mChallengeData = mChallengeData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.item_challenge, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Challenge challenge = mChallengeData.get(position);

        String title = challenge.getChallengeName();
        String moderatorName = challenge.getModeratorName();
        String endDate = challenge.getEndDate();
        String profileImage = challenge.getProfileImage();

        holder.challengeName.setText(title);
        holder.moderatorName.setText(moderatorName);
        holder.endDate.setText(Helpers.formatDate(endDate));
        Glide.with(mContext).load(profileImage).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return mChallengeData == null ? 0 : mChallengeData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView challengeName;
        private TextView moderatorName;
        private TextView startDate;
        private TextView endDate;
        private ImageView profileImage;
        private Button detailViewButton;

        public ViewHolder(View itemView) {
            super(itemView);
            challengeName = itemView.findViewById(R.id.challenge_title);
            moderatorName = itemView.findViewById(R.id.challenge_moderator_name);
            endDate = itemView.findViewById(R.id.challenge_date);
            profileImage = itemView.findViewById(R.id.challenge_profile_image);

        }
    }
}
