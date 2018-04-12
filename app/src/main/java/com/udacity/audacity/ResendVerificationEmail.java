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
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ResendVerificationEmail extends AppCompatActivity {

    private EditText ve_username;
    private EditText ve_password;
    private TextView ve_warning;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resend_verification_email);

        ve_username = findViewById(R.id.username_send_verification);
        ve_warning = findViewById(R.id.warning_send_verification);
        ve_password = findViewById(R.id.password_send_verification);

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);

    }


    public void send_verification_link(View view) {

        String username = ve_username.getText().toString();
        String password = ve_password.getText().toString();


        if (TextUtils.isEmpty(username)) {
            ve_warning.setText("USERNAME FIELD IS EMPTY");
            ve_warning.setVisibility(View.VISIBLE);
            return;
        }

        if (TextUtils.isEmpty(password)) {
            ve_warning.setText("PASSWORD FIELD IS EMPTY");
            ve_warning.setVisibility(View.VISIBLE);
            return;
        }

        progressDialog.setMessage("Sending Verification link");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(username, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            firebaseAuth.getCurrentUser().sendEmailVerification()
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            progressDialog.dismiss();
                                            Toast.makeText(ResendVerificationEmail.this, "Successfully Link Sent", Toast.LENGTH_SHORT).show();
                                            firebaseAuth.signOut();
                                            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                                            finish();
                                        }
                                    }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ResendVerificationEmail.this, "Sending Link Failed", Toast.LENGTH_SHORT).show();
                                }
                            });


                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressDialog.dismiss();
                Toast.makeText(ResendVerificationEmail.this, "Wrong Credential", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
