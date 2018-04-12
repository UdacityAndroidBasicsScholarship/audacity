package com.udacity.audacity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
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

public class CreateAccount extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private EditText ca_username;
    private EditText ca_password;
    private EditText ca_repassword;
    private TextView ca_warning_textView;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        ca_username = findViewById(R.id.username_create_account);
        ca_password = findViewById(R.id.password_create_account);
        ca_repassword = findViewById(R.id.repassword_create_account);
        ca_warning_textView = findViewById(R.id.warning_create_account);

        progressDialog = new ProgressDialog(this);

        firebaseAuth = FirebaseAuth.getInstance();

    }

    public void open_login_activity(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void register_account(View view) {

        String username = ca_username.getText().toString();
        String password = ca_password.getText().toString();
        String repassword = ca_repassword.getText().toString();

        ca_warning_textView.setVisibility(View.INVISIBLE);

        if (TextUtils.isEmpty(username)) {
            ca_warning_textView.setText("USERNAME FIELD IS EMPTY");
            ca_warning_textView.setVisibility(View.VISIBLE);
            return;
        }
        if (TextUtils.isEmpty(password)) {
            ca_warning_textView.setText("PASSWORD FIELD IS EMPTY");
            ca_warning_textView.setVisibility(View.VISIBLE);
            return;
        }
        if (TextUtils.isEmpty(repassword)) {
            ca_warning_textView.setText("PASSWORD FIELD IS EMPTY");
            ca_warning_textView.setVisibility(View.VISIBLE);
            return;
        }

        if (!(password.equals(repassword))) {
            ca_warning_textView.setText("PASSWORD SHOULD MATCH");
            ca_warning_textView.setVisibility(View.VISIBLE);
            return;
        }


        progressDialog.setMessage("Registering..Please Wait!!");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(username, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            progressDialog.dismiss();
                            Toast.makeText(getApplicationContext(),"Account is created Successfully",Toast.LENGTH_SHORT).show();
                            send_verification_email();
                            firebaseAuth.signOut();
                            startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                            finish();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(),"Failed to create Account",Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void send_verification_email() {

        firebaseAuth.getCurrentUser().sendEmailVerification()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getApplicationContext(),"Email is sent",Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(),"Something went wrong with  Email Verification",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
