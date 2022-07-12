package com.example.phone_numberauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText phoneno;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phoneno = findViewById(R.id.phoneNo);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = phoneno.getText().toString().trim();
                if (number . isEmpty() || number.length()<10){
                    phoneno.setError("Enter a valid phone number");
                    phoneno.requestFocus();
                    return;
                }

                String phoneNumber = "+254" + number;
                Intent intent = new Intent(getApplicationContext(), Phone_Verification.class);
                intent.putExtra("phonenumber",phoneNumber);
            }
        });

    }
}