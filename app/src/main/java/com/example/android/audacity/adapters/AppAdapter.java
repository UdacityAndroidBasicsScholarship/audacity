package com.example.android.audacity.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.audacity.R;
import com.example.android.audacity.models.AppItem;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.ViewHolder> {

    private ArrayList<AppItem> appItems;

    public AppAdapter(ArrayList<AppItem> items){
        this.appItems=items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.app_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.appIcon.setImageResource(appItems.get(position).getAppIcon());
        holder.appTitle.setText(appItems.get(position).getTitle());
        holder.appSubtitle.setText(appItems.get(position).getSubTitle());
        holder.dateCreated.setText(appItems.get(position).getDateCreated());
    }

    @Override
    public int getItemCount() {
        return appItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public CircleImageView appIcon;
        public TextView appTitle;
        public TextView appSubtitle;
        public TextView dateCreated;
        public ViewHolder(View itemView) {
            super(itemView);
            appIcon=(CircleImageView)itemView.findViewById(R.id.appIcon);
            appTitle=(TextView)itemView.findViewById(R.id.appTitle);
            appSubtitle=(TextView)itemView.findViewById(R.id.appSubtitle);
            dateCreated=(TextView)itemView.findViewById(R.id.datePosted);
        }
    }
}
