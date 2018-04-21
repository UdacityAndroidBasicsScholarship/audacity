package com.example.android.audacity;

import android.content.Intent;
import android.media.Image;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.audacity.fragments.ChallengesFragment;
import com.example.android.audacity.fragments.HomeFragment;
import com.example.android.audacity.fragments.HottestAppFragment;
import com.example.android.audacity.fragments.QuizzesFragment;
import com.example.android.audacity.fragments.ResultsFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = DashboardActivity.class.getSimpleName();
    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;
    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mFirebaseAuth = FirebaseAuth.getInstance();
        if (mFirebaseAuth == null) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();

        }
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();
        mNavigationView = findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
        setHomeFragment();

        if (mFirebaseAuth != null) {
            FirebaseUser user = mFirebaseAuth.getCurrentUser();
            TextView userProfileName = mNavigationView.getHeaderView(0).findViewById(R.id.user_profile_name_TV);
            TextView userProfileEmail = mNavigationView.getHeaderView(0).findViewById(R.id.user_profile_email_TV);
            ImageView userProfileImage = mNavigationView.getHeaderView(0).findViewById(R.id.user_profile_image_IV);

            userProfileName.setText(mFirebaseAuth.getCurrentUser().getDisplayName());
            userProfileEmail.setText(mFirebaseAuth.getCurrentUser().getEmail());
            String imagePath = mFirebaseAuth.getCurrentUser().getPhotoUrl().toString();
            if (imagePath != null) {
                    Glide.with(this).load(imagePath).into(userProfileImage);
            }

        }
    }

    private void setHomeFragment() {
        setTitle(getString(R.string.home));
        mNavigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
        setMyFragment(new HomeFragment());
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        setTitle(mNavigationView.getMenu().findItem(id).getTitle());
        Fragment fragment = null;
        switch (id) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_hottest_app:
                fragment = new HottestAppFragment();
                break;
            case R.id.nav_challenges:
                fragment = new ChallengesFragment();
                break;
            case R.id.nav_quizzes:
                fragment = new QuizzesFragment();
                break;
            case R.id.nav_results:
                fragment = new ResultsFragment();
                break;
            default:
                fragment = new HomeFragment();
                break;
        }
        if (fragment != null) {
            setMyFragment(fragment);
        }
        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setMyFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.dashboard_container, fragment)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.nav_settings:
                Intent intent = new Intent(DashboardActivity.this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_sign_out:
                if (mFirebaseAuth != null) {
                    mFirebaseAuth.signOut();
                    Intent intent1 = new Intent(DashboardActivity.this, LoginActivity.class);
                    startActivity(intent1);
                    finish();
                }
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
