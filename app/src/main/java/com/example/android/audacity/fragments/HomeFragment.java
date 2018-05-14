package com.example.android.audacity.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.audacity.R;
import com.example.android.audacity.pojo.Challenge;
import com.example.android.audacity.pojo.HottestApp;
import com.example.android.audacity.utilities.Constants;
import com.example.android.audacity.utilities.Helpers;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private FirebaseDatabase mFirebaseDb;
    private DatabaseReference mDbRef;
    private View mRootView;
    private Context mContext;

    private TextView mHottestAppTitle;
    private TextView mHottestStudentName;
    private TextView mHottestPostedOn;
    private ImageView mHottestProfileImage;

    private TextView mChallengeName;
    private TextView mChallengeModName;
    private TextView mChallengeEndDate;
    private ImageView mChallengeProfileImage;

    public HomeFragment() {
        mFirebaseDb = FirebaseDatabase.getInstance();
        mDbRef = mFirebaseDb.getReference();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_home, container, false);
        mContext = mRootView.getContext();
        mHottestAppTitle = mRootView.findViewById(R.id.hottest_app_title);
        mHottestStudentName = mRootView.findViewById(R.id.hottest_app_student_name);
        mHottestPostedOn = mRootView.findViewById(R.id.hottest_app_date);
        mHottestProfileImage = mRootView.findViewById(R.id.hottest_app_profile_image);

        mChallengeName = mRootView.findViewById(R.id.challenge_title);
        mChallengeModName = mRootView.findViewById(R.id.challenge_moderator_name);
        mChallengeEndDate = mRootView.findViewById(R.id.challenge_date);
        mChallengeProfileImage = mRootView.findViewById(R.id.challenge_profile_image);

        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHottestAppData();
        setChallengeData();
    }

    private void setChallengeData() {
        mDbRef.child(Constants.CHALLENGES_STRING).limitToLast(1).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Challenge challenge = snapshot.getValue(Challenge.class);
                    mChallengeName.setText(challenge.getChallengeName());
                    mChallengeModName.setText(challenge.getModeratorName());
                    mChallengeEndDate.setText(Helpers.formatDate(challenge.getStartDate()));
                    String profileImage = challenge.getProfileImage();
                    if (profileImage != null) {
                        Glide.with(mContext).load(profileImage).into(mChallengeProfileImage);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void setHottestAppData() {
        mDbRef.child(Constants.HOTTEST_APP_STRING).limitToLast(1).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    HottestApp hottestApp = snapshot.getValue(HottestApp.class);
                    mHottestAppTitle.setText(hottestApp.getAppTitle());
                    mHottestStudentName.setText(hottestApp.getStudentName());
                    mHottestPostedOn.setText(Helpers.formatDate(hottestApp.getPostedDate()));
                    String profileImage = hottestApp.getProfileImage();
                    if (profileImage != null) {
                        Glide.with(mContext).load(profileImage).into(mHottestProfileImage);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
