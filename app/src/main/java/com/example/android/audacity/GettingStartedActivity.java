package com.example.android.audacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class GettingStartedActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textprofile;
    private Button logout;
    private FirebaseAuth firebaseAuth2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started);

        firebaseAuth2 = FirebaseAuth.getInstance();
        if(firebaseAuth2 == null){
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        FirebaseUser user = firebaseAuth2.getCurrentUser();
        textprofile = findViewById(R.id.profile);

        textprofile.setText("Welcome \n" + user.getEmail());
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view == logout){
            firebaseAuth2.signOut();
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }

    }
}
