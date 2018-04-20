package com.example.android.audacity.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.audacity.R;
import com.example.android.audacity.models.QuizItem;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.ViewHolder> {

    private ArrayList<QuizItem> quizItems;

    public QuizAdapter(ArrayList<QuizItem> items){
        this.quizItems=items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quiz_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.quizIcon.setImageResource(quizItems.get(position).getQuizIcon());
        holder.quizTitle.setText(quizItems.get(position).getTitle());
        holder.quizSubtitle.setText(quizItems.get(position).getSubTitle());
        holder.dateCreated.setText(quizItems.get(position).getDateCreated());
    }

    @Override
    public int getItemCount() {
        return quizItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public CircleImageView quizIcon;
        public TextView quizTitle;
        public TextView quizSubtitle;
        public TextView dateCreated;
        public ViewHolder(View itemView) {
            super(itemView);
            quizIcon=(CircleImageView)itemView.findViewById(R.id.quizIcon);
            quizTitle=(TextView)itemView.findViewById(R.id.quizTitle);
            quizSubtitle=(TextView)itemView.findViewById(R.id.quizSubtitle);
            dateCreated=(TextView)itemView.findViewById(R.id.datePosted);
        }
    }
}
