package com.example.android.audacity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by acer on 17-04-2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<RecyclerViewHelper> listItems;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView headerTextView, nameTextView, dateTextView;
        public ImageView profilePhoto;

        //inner class consructor
        public MyViewHolder(View view) {
            super(view);
            profilePhoto = (ImageView) view.findViewById(R.id.profile_icon_imageview);
            headerTextView = (TextView) view.findViewById(R.id.header_textview);
            nameTextView = (TextView) view.findViewById(R.id.name_textiew);
            dateTextView = (TextView) view.findViewById(R.id.date_textview);
        }
    }//end of internal class

    //constructor for outer class
    public RecyclerViewAdapter(List<RecyclerViewHelper> listItems) {
        this.listItems = listItems;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.default_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        RecyclerViewHelper currentItem = listItems.get(position);
        holder.profilePhoto.setImageResource(currentItem.getProfileIcon());
        holder.headerTextView.setText(currentItem.getmHeader());
        holder.nameTextView.setText(currentItem.getmStudentName());
        holder.dateTextView.setText(currentItem.getmDateCreated());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
}
