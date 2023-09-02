package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BillDetails extends AppCompatActivity {
    Button _bc11;
    Button _bc12;
    Button _bc13;
    Button _bc14;
    Button _bc15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_detailsadmin);
        _bc11=(Button)findViewById(R.id.bc11);
        _bc12=(Button)findViewById(R.id.bc12);
        _bc13=(Button)findViewById(R.id.bc13);
        _bc14=(Button)findViewById(R.id.bc14);
        _bc15=(Button)findViewById(R.id.bc15);
        _bc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillDetails.this,adminbill101.class);
                startActivity(intent);
            }
        });
        _bc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillDetails.this,adminbill102.class);
                startActivity(intent);
            }
        });
        _bc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillDetails.this,adminbill103.class);
                startActivity(intent);
            }
        });
        _bc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillDetails.this,adminbill104.class);
                startActivity(intent);
            }
        });
        _bc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillDetails.this,adminbill105.class);
                startActivity(intent);
            }
        });
    }
}