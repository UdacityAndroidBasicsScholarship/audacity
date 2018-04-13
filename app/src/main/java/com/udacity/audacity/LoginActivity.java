package com.udacity.audacity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private EditText login_username;
    private EditText login_password;
    private TextView warning;
    private FirebaseAuth firebaseAuthent;
    private FirebaseAuth.AuthStateListener firebase_auth_listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_username = findViewById(R.id.username_login_account);
        login_password = findViewById(R.id.password_login_account);

        warning = findViewById(R.id.warning_login_account);

        firebaseAuthent = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);

        firebase_auth_listener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null){
                    if(firebaseAuth.getCurrentUser().isEmailVerified()){
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    else {
                        firebaseAuth.signOut();
                        Toast.makeText(getApplicationContext(), "Email is not verified", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };


    }

    public void open_create_account_activity(View view) {
        startActivity(new Intent(this, CreateAccount.class));
        finish();
    }


    public void login_account(View view) {

        String username = login_username.getText().toString();
        String password = login_password.getText().toString();

        if (TextUtils.isEmpty(username)) {
            warning.setText("USERNAME FIELD IS EMPTY");
            warning.setVisibility(View.VISIBLE);
            return;
        }
        if (TextUtils.isEmpty(password)) {
            warning.setText("PASSWORD FIELD IS EMPTY");
            warning.setVisibility(View.VISIBLE);
            return;
        }

        progressDialog.setMessage("Login..Please Wait!!");
        progressDialog.show();

        firebaseAuthent.signInWithEmailAndPassword(username, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            progressDialog.dismiss();
                        }


                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(), "Failed to sign In", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuthent.addAuthStateListener(firebase_auth_listener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (firebase_auth_listener != null)
            firebaseAuthent.removeAuthStateListener(firebase_auth_listener);
    }

    public void open_forgot_password(View view) {
        startActivity(new Intent(this,ForgotPassword.class));
    }

    public void open_send_verification(View view) {
        startActivity(new Intent(this,ResendVerificationEmail.class));
    }
}
