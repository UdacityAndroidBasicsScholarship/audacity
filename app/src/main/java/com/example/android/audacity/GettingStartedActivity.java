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
//hoa-Hottest app of the day
        TextView hoa = (TextView) findViewById(R.id.H_aod);

        // Set a click listener on that View
        hoa.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent haod = new Intent(GettingStartedActivity.this, HAOD.class);

                // Start the new activity
                startActivity(haod);
            }
        });
        //chll=  Challenges
        TextView ch = (TextView) findViewById(R.id.chll);

        // Set a click listener on that View
        ch.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ch_ll = new Intent(GettingStartedActivity.this, challenges.class);

                // Start the new activity
                startActivity(ch_ll);
            }
        });
        //disc=  discussions
        TextView dii = (TextView) findViewById(R.id.disc);

        // Set a click listener on that View
        dii.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent di_sc = new Intent(GettingStartedActivity.this, Discussions.class);

                // Start the new activity
                startActivity(di_sc);
            }
        });
        //resu=result
        TextView re = (TextView) findViewById(R.id.resu);

        // Set a click listener on that View
        re.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent re_su = new Intent(GettingStartedActivity.this, Results.class);

                // Start the new activity
                startActivity(re_su);
            }
        });

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
