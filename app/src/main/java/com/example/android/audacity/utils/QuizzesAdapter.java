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
import com.example.android.audacity.models.QuizzesModel;

import java.util.ArrayList;

public class QuizzesAdapter extends RecyclerView.Adapter<QuizzesAdapter.QuizzesViewHolder> {

    private Context mContext;
    private ArrayList<QuizzesModel> mQuizList;

    public QuizzesAdapter(Context context, ArrayList<QuizzesModel> quizList) {
        this.mContext = context;
        this.mQuizList = quizList;
    }

    @NonNull
    @Override
    public QuizzesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View quizView = LayoutInflater.from(mContext)
                .inflate(R.layout.individual_fragment_item_layout, parent, false);
        return new QuizzesViewHolder(quizView);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizzesViewHolder holder, int position) {
        QuizzesModel quizModel = mQuizList.get(position);
        holder.mProfileImage.setBackgroundResource(quizModel.getmProfileImageId());
        holder.mQuizName.setText(quizModel.getmQuizName());
        holder.mModeratorName.setText(quizModel.getmModeratorName());
        holder.mEndDate.setText(quizModel.getmEndDate());
    }

    @Override
    public int getItemCount() {
        return mQuizList.size();
    }

    class QuizzesViewHolder extends RecyclerView.ViewHolder {

        ImageView mProfileImage;
        TextView mQuizName;
        TextView mModeratorName;
        TextView mEndDate;

        QuizzesViewHolder(View itemView) {
            super(itemView);
            mProfileImage = itemView.findViewById(R.id.profile_image);
            mQuizName = itemView.findViewById(R.id.header_text);
            mModeratorName = itemView.findViewById(R.id.sub_text);
            mEndDate = itemView.findViewById(R.id.date_text);
        }
    }
}
