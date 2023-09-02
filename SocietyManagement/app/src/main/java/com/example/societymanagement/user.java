package com.example.societymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class user extends AppCompatActivity {
    Button _btnClick11;
    Button _btnClick12;
    Button _btnClick13;
    Button _btnClick14;
    Button _btnClick51;
    Button _btnClick61;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        _btnClick11=(Button)findViewById(R.id.btnClick11);
        _btnClick12=(Button)findViewById(R.id.btnClick12);
        _btnClick13=(Button)findViewById(R.id.btnClick13);
        _btnClick14=(Button)findViewById(R.id.btnClick14);
        _btnClick51=(Button)findViewById(R.id.btnClick51);
        _btnClick61=(Button)findViewById(R.id.btnClick61);
        _btnClick11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this,useraddup101.class);
                startActivity(intent);
            }
        });
        _btnClick12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this,userbill101.class);
                startActivity(intent);
            }
        });
        _btnClick13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this,usercomp101.class);
                startActivity(intent);
            }
        });
        _btnClick14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this,usernote101.class);
                startActivity(intent);
            }
        });
        _btnClick51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this,feeduser101.class);
                startActivity(intent);
            }
        });
        _btnClick61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this,docuser1.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Toast.makeText(user.this, "Info has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(user.this, "Sharing has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(user.this, "Bluetooth has been pressed", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.icon1)
                .setTitle("Society Management App")
                .setMessage("Are you sure you want to close the App?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                })
                .setNegativeButton("NO", null)
                .show();
    }
}