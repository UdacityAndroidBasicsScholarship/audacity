package com.example.android.loginusingsqlite;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Username;
    private EditText Password;
    private EditText Repassword;
    private Button signup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    private TextView WarningTextSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Repassword = findViewById(R.id.repassword);
        WarningTextSignUp=findViewById(R.id.warning_signup_account);

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
        if (view == signup) {
            registerUser();
        }
    }

    private void registerUser() {

        String username = Username.getText().toString().trim();
        String password = Password.getText().toString().trim();
        String repassword = Repassword.getText().toString().trim();

        WarningTextSignUp.setVisibility(View.INVISIBLE);


        if (TextUtils.isEmpty(username)) {
            WarningTextSignUp.setText("USERNAME FIELD SHOULD NOT BE  EMPTY");
            WarningTextSignUp.setVisibility(View.VISIBLE);
            return;
        }
        if (TextUtils.isEmpty(password)) {
            WarningTextSignUp.setText("PASSWORD FIELD SHOULD NOT BE EMPTY");
            WarningTextSignUp.setVisibility(View.VISIBLE);
            return;
        }
        if (TextUtils.isEmpty(repassword)) {
            WarningTextSignUp.setText("RE-PASSWORD FIELD SHOULD NOT BE EMPTY");
            WarningTextSignUp.setVisibility(View.VISIBLE);
            return;
        }

        if (!(password.equals(repassword))) {
            WarningTextSignUp.setText("PASSWORD SHOULD MATCH");
            WarningTextSignUp.setVisibility(View.VISIBLE);
            return;
        }

        progressDialog.setMessage("Registering User....");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {



                if (task.isSuccessful()) {
                    progressDialog.dismiss();
                    Toast.makeText(SignupActivity.this, "Registration Successful!", Toast.LENGTH_LONG).show();
                    Intent start = new Intent(SignupActivity.this, GettingStartedActivity.class);
                    startActivity(start);
                    finish();
                } else {
                    progressDialog.dismiss();
                    Toast.makeText(SignupActivity.this, "Could not register try again", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
