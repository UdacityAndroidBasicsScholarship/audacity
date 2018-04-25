package com.example.android.audacity.adapter_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.audacity.R;

import java.util.ArrayList;

public class HomeCardAdapter extends ArrayAdapter<Card> {

    public HomeCardAdapter(@NonNull Context context, @NonNull ArrayList<Card> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_list_item_layout, parent, false
            );
        }

        //Get the object at this position in this list
        Card currentCard = getItem(position);

        //Find Each of the TextViews and setText
        //CardHeading
        TextView homeCardHeadingTextView = listItemView.findViewById(R.id.card_heading);
        homeCardHeadingTextView.setText(currentCard.getHomeCardHeading());

        //CardTitle
        TextView homeCardTitleTextView = listItemView.findViewById(R.id.card_title);
        homeCardTitleTextView.setText(currentCard.getCardTitle());

        //CardAuthor
        TextView homeCardAuthorTextView = listItemView.findViewById(R.id.card_author);
        homeCardAuthorTextView.setText(currentCard.getCardAuthor());

        //CardDate
        TextView homeCardDateTextView = listItemView.findViewById(R.id.card_date);
        homeCardDateTextView.setText(currentCard.getCardDate());

        return listItemView;
    }
}
