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

public class User3Activity extends AppCompatActivity {
    Button _btnClick23;
    Button _btnClick24;
    Button _btnClick25;
    Button _btnClick26;
    Button _btnClick54;
    Button _btnClick64;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user3);
        _btnClick23=(Button)findViewById(R.id.btnClick23);
        _btnClick24=(Button)findViewById(R.id.btnClick24);
        _btnClick25=(Button)findViewById(R.id.btnClick25);
        _btnClick26=(Button)findViewById(R.id.btnClick26);
        _btnClick54=(Button)findViewById(R.id.btnClick54);
        _btnClick64=(Button)findViewById(R.id.btnClick64);
        _btnClick23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User3Activity.this,useraddup104.class);
                startActivity(intent);
            }
        });
        _btnClick24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User3Activity.this,userbill104.class);
                startActivity(intent);
            }
        });
        _btnClick25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User3Activity.this,usercomp104.class);
                startActivity(intent);
            }
        });
        _btnClick26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User3Activity.this,usernote104.class);
                startActivity(intent);
            }
        });
        _btnClick54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User3Activity.this,feeduser104.class);
                startActivity(intent);
            }
        });
        _btnClick64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User3Activity.this,docuser4.class);
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
                Toast.makeText(User3Activity.this, "Info has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(User3Activity.this, "Sharing has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(User3Activity.this, "Bluetooth has been pressed", Toast.LENGTH_SHORT).show();
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