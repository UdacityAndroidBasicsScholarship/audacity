package com.example.android.audacity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Username;
    private EditText Password;
    private Button signup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        signup = findViewById(R.id.sign_up);
        signup.setOnClickListener(this);

    }

    public void login_page(View view) {
        Intent login = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(login);
        finish();
    }

    @Override
    public void onClick(View view) {
        if(view == signup){
            registerUser();
        }
    }

    private void registerUser() {
        String username = Username.getText().toString().trim();
        String password = Password.getText().toString().trim();

        if(TextUtils.isEmpty(username)){
            Toast.makeText(SignupActivity.this, "Please enter a valid username", Toast.LENGTH_SHORT).show();
            return ;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(SignupActivity.this, "Please enter a valid(text) password", Toast.LENGTH_SHORT).show();
            return ;
        }
        progressDialog.setMessage("Registering User....");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    Toast.makeText(SignupActivity.this, "Registration Successful!", Toast.LENGTH_LONG).show();
                    Intent start = new Intent(SignupActivity.this, GettingStartedActivity.class);
                    startActivity(start);
                    finish();
                } else{
                    Toast.makeText(SignupActivity.this, "Could not register try again", Toast.LENGTH_LONG).show();
                    Log.w("Error signup", "signInWithEmail:failure", task.getException());
                }

            }
        });

    }
}
