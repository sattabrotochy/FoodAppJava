package com.example.foodappjava.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodappjava.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void userRegistration(View view) {

    }

    public void userSignIn(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }
}