package com.example.project_seg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView username;
    TextView password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);


    }

}