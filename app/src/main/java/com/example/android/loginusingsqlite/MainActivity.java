package com.example.android.loginusingsqlite;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Username;
    private EditText Password;
    private FloatingActionButton login;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null) {
            Toast.makeText(this, "Already Logged in", Toast.LENGTH_LONG).show();
            Intent profile = new Intent(MainActivity.this, GettingStartedActivity.class);
            startActivity(profile);
        }
        Username = findViewById(R.id.usernameLogin);
        Password = findViewById(R.id.passwordLogin);
        progressDialog = new ProgressDialog(this);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);


    }

    public void sign_up_page(View view) {

        Intent signup = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(signup);
        finish();
    }

    @Override
    public void onClick(View view) {
        if (view == login) {
            loginuser();
        }
    }

    private void loginuser() {
        String username = Username.getText().toString().trim();
        String password = Password.getText().toString().trim();
        if (TextUtils.isEmpty(username)) {
            Toast.makeText(MainActivity.this, "Enter a valid username", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(MainActivity.this, "Enter a valid password", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Checking info...");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(username, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "Login sucessful", Toast.LENGTH_LONG).show();
                    Intent profile = new Intent(MainActivity.this, GettingStartedActivity.class);
                    startActivity(profile);
                    progressDialog.dismiss();
                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                    Username.setText("");
                    Password.setText("");

                }

            }
        });

    }
}
