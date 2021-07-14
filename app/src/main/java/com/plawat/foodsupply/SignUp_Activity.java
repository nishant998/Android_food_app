package com.plawat.foodsupply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.plawat.foodsupply.R.layout.activity_sign_up;

public class SignUp_Activity extends AppCompatActivity {
    private TextView login_here ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_sign_up);
        getSupportActionBar().setTitle("Sign up");
        login_here = findViewById(R.id.textView7) ;
        login_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Activity.this , SignIn_Activity.class) ;
                startActivity(intent);
            }
        });
    }
}