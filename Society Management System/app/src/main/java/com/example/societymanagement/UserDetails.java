package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserDetails extends AppCompatActivity {
    Button _bc6;
    Button _bc7;
    Button _bc8;
    Button _bc9;
    Button _bc10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detailsadmin);
        _bc6=(Button)findViewById(R.id.bc6);
        _bc7=(Button)findViewById(R.id.bc7);
        _bc8=(Button)findViewById(R.id.bc8);
        _bc9=(Button)findViewById(R.id.bc9);
        _bc10=(Button)findViewById(R.id.bc10);
        _bc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetails.this,adminuser101.class);
                startActivity(intent);
            }
        });
        _bc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetails.this,adminuser102.class);
                startActivity(intent);
            }
        });
        _bc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetails.this,adminuser103.class);
                startActivity(intent);
            }
        });
        _bc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetails.this,adminuser104.class);
                startActivity(intent);
            }
        });
        _bc10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetails.this,adminuser105.class);
                startActivity(intent);
            }
        });
    }
}