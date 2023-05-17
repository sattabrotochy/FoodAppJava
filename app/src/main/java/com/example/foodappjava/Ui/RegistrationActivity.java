package com.example.foodappjava.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.foodappjava.R;

public class RegistrationActivity extends AppCompatActivity {


    EditText userName,userEmail,userPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        viewBinding();


    }

    private void viewBinding() {
        userName=findViewById(R.id.user_Name);
        userEmail=findViewById(R.id.user_Email);
        userPassword=findViewById(R.id.user_Password);
    }

    public void userRegistration(View view) {

    }

    public void userSignIn(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }
}