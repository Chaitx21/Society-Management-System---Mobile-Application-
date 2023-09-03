package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Complaints extends AppCompatActivity {
    Button _bc16;
    Button _bc17;
    Button _bc18;
    Button _bc19;
    Button _bc20;
    Button _bc21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaintsadmin);
        _bc16=(Button)findViewById(R.id.bc16);
        _bc17=(Button)findViewById(R.id.bc17);
        _bc18=(Button)findViewById(R.id.bc18);
        _bc19=(Button)findViewById(R.id.bc19);
        _bc20=(Button)findViewById(R.id.bc20);
        _bc21=(Button)findViewById(R.id.bc21);
        _bc16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Complaints.this,admincomp101.class);
                startActivity(intent);
            }
        });
        _bc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Complaints.this,admincomp102.class);
                startActivity(intent);
            }
        });
        _bc18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Complaints.this,admincomp103.class);
                startActivity(intent);
            }
        });
        _bc19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Complaints.this,admincomp104.class);
                startActivity(intent);
            }
        });
        _bc20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Complaints.this,admincomp105.class);
                startActivity(intent);
            }
        });
        _bc21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Complaints.this,AllComplaintsadmin.class);
                startActivity(intent);
            }
        });
    }
}