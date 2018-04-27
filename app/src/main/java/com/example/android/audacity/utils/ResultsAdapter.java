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
import com.example.android.audacity.models.ResultsModel;

import java.util.ArrayList;

public class ResultsAdapter extends RecyclerView.Adapter<ResultsAdapter.ResultsViewHolder> {

    private Context mContext;
    private ArrayList<ResultsModel> mResultsList;

    public ResultsAdapter(Context context, ArrayList<ResultsModel> resultsList) {
        this.mContext = context;
        this.mResultsList = resultsList;
    }

    @NonNull
    @Override
    public ResultsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View resultView = LayoutInflater.from(mContext)
                .inflate(R.layout.individual_fragment_item_layout, parent, false);
        return new ResultsViewHolder(resultView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultsViewHolder holder, int position) {
        ResultsModel resultModel = mResultsList.get(position);
        holder.mProfileImage.setBackgroundResource(resultModel.getmProfileImageId());
        holder.mQuiz_ChallengeName.setText(resultModel.getmQuiz_ChallengeName());
        holder.mModeratorName.setText(resultModel.getmModeratorName());
        holder.mPostedDate.setText(resultModel.getmPostedDate());
    }

    @Override
    public int getItemCount() {
        return mResultsList.size();
    }

    class ResultsViewHolder extends RecyclerView.ViewHolder {

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
}
