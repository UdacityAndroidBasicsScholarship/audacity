package com.example.android.audacity.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.audacity.R;
import com.example.android.audacity.models.ResultsModel;

import java.util.ArrayList;

public class ResultsAdapter extends RecyclerView.Adapter<ResultsViewHolder> {

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
}
