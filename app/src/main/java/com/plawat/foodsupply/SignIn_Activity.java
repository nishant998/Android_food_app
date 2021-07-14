package com.plawat.foodsupply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {

    private TextView create_here ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Sign in");

        create_here = findViewById(R.id.textView7) ;
        create_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_Activity.this , SignUp_Activity.class) ;
                startActivity(intent);
            }
        });
    }
}