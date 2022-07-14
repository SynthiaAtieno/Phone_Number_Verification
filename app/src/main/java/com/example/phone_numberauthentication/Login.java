package com.example.phone_numberauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                Toast.makeText(Login.this, "Clicked", Toast.LENGTH_SHORT).show();
                String number = phoneno.getText().toString().trim();
                if (number . isEmpty() || number.length()<9){
                    phoneno.setError("Enter a valid phone number");
                    phoneno.requestFocus();
                    return;
                }
                String phoneNumber = number;
                Intent intent = new Intent(Login.this, Phone_Verification.class);
                intent.putExtra("phonenumber",phoneNumber);
            }
        });

    }
}