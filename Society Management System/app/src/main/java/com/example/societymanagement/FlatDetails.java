package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlatDetails extends AppCompatActivity {
    Button _bc1;
    Button _bc2;
    Button _bc3;
    Button _bc4;
    Button _bc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_detailsadmin);
        _bc1=(Button)findViewById(R.id.bc1);
        _bc2=(Button)findViewById(R.id.bc2);
        _bc3=(Button)findViewById(R.id.bc3);
        _bc4=(Button)findViewById(R.id.bc4);
        _bc5=(Button)findViewById(R.id.bc5);
        _bc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlatDetails.this,adminflat101.class);
                startActivity(intent);
            }
        });
        _bc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlatDetails.this,adminflat102.class);
                startActivity(intent);
            }
        });
        _bc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlatDetails.this,adminflat103.class);
                startActivity(intent);
            }
        });
        _bc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlatDetails.this,adminflat104.class);
                startActivity(intent);
            }
        });
        _bc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlatDetails.this,adminflat105.class);
                startActivity(intent);
            }
        });
        
    }
}