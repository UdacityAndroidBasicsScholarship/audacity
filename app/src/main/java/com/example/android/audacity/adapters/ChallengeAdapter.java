package com.example.android.audacity.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.audacity.R;
import com.example.android.audacity.models.ChallengeItem;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ViewHolder> {

    private ArrayList<ChallengeItem> challengeItems;

    public ChallengeAdapter(ArrayList<ChallengeItem> items){
        this.challengeItems=items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.challenge_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.challengeIcon.setImageResource(challengeItems.get(position).getChallengeIcon());
        holder.challengeTitle.setText(challengeItems.get(position).getTitle());
        holder.challengeSubtitle.setText(challengeItems.get(position).getSubTitle());
        holder.dateCreated.setText(challengeItems.get(position).getDateCreated());
    }

    @Override
    public int getItemCount() {
        return challengeItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public CircleImageView challengeIcon;
        public TextView challengeTitle;
        public TextView challengeSubtitle;
        public TextView dateCreated;
        public ViewHolder(View itemView) {
            super(itemView);
            challengeIcon=(CircleImageView)itemView.findViewById(R.id.challengeIcon);
            challengeTitle=(TextView)itemView.findViewById(R.id.challengeTitle);
            challengeSubtitle=(TextView)itemView.findViewById(R.id.challengeSubtitle);
            dateCreated=(TextView)itemView.findViewById(R.id.datePosted);
        }
    }
}
