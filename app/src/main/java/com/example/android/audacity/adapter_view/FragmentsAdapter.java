package com.example.android.audacity.adapter_view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.audacity.R;

import java.util.List;

public class FragmentsAdapter extends RecyclerView.Adapter<FragmentsAdapter.ViewHolder> {
    private List<HomeCard> cardsList;

    // Constructor
    public FragmentsAdapter(List<HomeCard> cards) {
        this.cardsList = cards;
    }

    //Create new views (invoked by the layout manager)
    @Override
    public FragmentsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_card_list_item_layout, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Sets Data onto ViewHolder
        holder.titleTextView.setText(cardsList.get(position).getHomeCardTitle());
        holder.authorTextView.setText(cardsList.get(position).getHomeCardAuthor());
        holder.dateTextVIew.setText(cardsList.get(position).getHomeCardDate());
    }

    //Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return cardsList.size();
    }

    //Find all Views
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //each data item is just a string in this case
        TextView titleTextView, authorTextView, dateTextVIew;

        public ViewHolder(View v) {
            super(v);
            //Hide views in the heading since they're not required
            v.findViewById(R.id.home_card_heading).setVisibility(View.GONE);
            v.findViewById(R.id.view_all_textview).setVisibility(View.GONE);
            //TextViews to populate
            titleTextView = v.findViewById(R.id.home_card_title);
            authorTextView = v.findViewById(R.id.home_card_author);
            dateTextVIew = v.findViewById(R.id.home_card_date);
        }
    }
}