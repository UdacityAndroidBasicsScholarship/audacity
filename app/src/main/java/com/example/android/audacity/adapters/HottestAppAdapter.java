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
import com.example.android.audacity.pojo.HottestApp;
import com.example.android.audacity.utilities.Helpers;

import java.util.ArrayList;

public class HottestAppAdapter extends RecyclerView.Adapter<HottestAppAdapter.ViewHolder> {

    private ArrayList<HottestApp> mHottestAppData;
    private Context mContext;

    public HottestAppAdapter(ArrayList<HottestApp> hottestAppData, Context context) {
        this.mHottestAppData = hottestAppData;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.item_hottest_app,parent , false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            HottestApp hottestApp = mHottestAppData.get(position);

            String title = hottestApp.getAppTitle();
            String studentName =hottestApp.getStudentName();
            String postedOn = hottestApp.getPostedDate();
            String profileImage = hottestApp.getProfileImage();

            holder.appTitle.setText(title);
            holder.studentName.setText(studentName);
            holder.postedOn.setText(Helpers.formatDate(postedOn));
            Glide.with(mContext).load(profileImage).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return mHottestAppData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView appTitle;
        private TextView studentName;
        private TextView postedOn;
        private ImageView profileImage;
        private Button detailViewButton;

        public ViewHolder(View itemView) {
            super(itemView);
            appTitle = itemView.findViewById(R.id.hottest_app_title);
            studentName = itemView.findViewById(R.id.hottest_app_student_name);
            postedOn = itemView.findViewById(R.id.hottest_app_date);
            profileImage = itemView.findViewById(R.id.hottest_app_profile_image);
            detailViewButton = itemView.findViewById(R.id.hottest_app_detail_button);
        }
    }
}
