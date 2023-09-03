package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notices extends AppCompatActivity {
    Button _bc21;
    Button _bc22;
    Button _bc23;
    Button _bc24;
    Button _bc25;
    Button _bc26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticesadmin);
        _bc21=(Button)findViewById(R.id.bc21);
        _bc22=(Button)findViewById(R.id.bc22);
        _bc23=(Button)findViewById(R.id.bc23);
        _bc24=(Button)findViewById(R.id.bc24);
        _bc25=(Button)findViewById(R.id.bc25);
        _bc26=(Button)findViewById(R.id.bc26);
        _bc21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notices.this,adminnote101.class);
                startActivity(intent);
            }
        });
        _bc22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notices.this,adminnote102.class);
                startActivity(intent);
            }
        });
        _bc23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notices.this,adminnote103.class);
                startActivity(intent);
            }
        });
        _bc24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notices.this,adminnote104.class);
                startActivity(intent);
            }
        });
        _bc25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notices.this,adminnote105.class);
                startActivity(intent);
            }
        });
        _bc26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notices.this,AllNoticeadmin.class);
                startActivity(intent);
            }
        });
    }
}