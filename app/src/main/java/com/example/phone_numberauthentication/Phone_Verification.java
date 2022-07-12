package com.example.phone_numberauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Phone_Verification extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

        String phonenumber = getIntent().getStringExtra("phonenumber");


    }
}