package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView textEmail, textPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textEmail = findViewById(R.id.textEmail);
        textPhone = findViewById(R.id.textPhone);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        textEmail.setText("Email: " + username);
        textPhone.setText("Password: " + password);
    }
}
