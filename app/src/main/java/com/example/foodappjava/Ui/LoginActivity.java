package com.example.foodappjava.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.foodappjava.R;

public class LoginActivity extends AppCompatActivity {


    EditText userEmail,userPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        viewBinding();
    }

    private void viewBinding() {
        userEmail=findViewById(R.id.user_Email);
        userPassword=findViewById(R.id.user_Password);
    }

    public void signUp(View view) {
        startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
    }

    public void loginUser(View view) {

    }

    public void forgotPassword(View view) {

    }
}