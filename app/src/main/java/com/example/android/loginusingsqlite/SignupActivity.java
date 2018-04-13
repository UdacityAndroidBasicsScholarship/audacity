package com.example.android.loginusingsqlite;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

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
                    progressDialog.hide();
                    String text;
                    try {
                        throw task.getException();
                    } catch(FirebaseAuthWeakPasswordException e) {
                        text = "Please a stronger password and try again.";
                    } catch(FirebaseAuthInvalidCredentialsException e) {
                        text = "Please enter a valid e-mail address and try again.";
                    } catch(FirebaseAuthUserCollisionException e) {
                        text = "An User with same email already exists and try again.";
                    } catch (Exception e){
                        text = "Unknown error. Please try again.";
                    }
                    Toast.makeText(SignupActivity.this, text, Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
