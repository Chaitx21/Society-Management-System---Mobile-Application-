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

public class User4Activity extends AppCompatActivity {
    Button _btnClick27;
    Button _btnClick28;
    Button _btnClick29;
    Button _btnClick30;
    Button _btnClick55;
    Button _btnClick65;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user4);
        _btnClick27=(Button)findViewById(R.id.btnClick27);
        _btnClick28=(Button)findViewById(R.id.btnClick28);
        _btnClick29=(Button)findViewById(R.id.btnClick29);
        _btnClick30=(Button)findViewById(R.id.btnClick30);
        _btnClick55=(Button)findViewById(R.id.btnClick55);
        _btnClick65=(Button)findViewById(R.id.btnClick65);
        _btnClick27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User4Activity.this,useraddup105.class);
                startActivity(intent);
            }
        });
        _btnClick28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User4Activity.this,userbill105.class);
                startActivity(intent);
            }
        });
        _btnClick29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User4Activity.this,usercomp105.class);
                startActivity(intent);
            }
        });
        _btnClick30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User4Activity.this,usernote105.class);
                startActivity(intent);
            }
        });
        _btnClick55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User4Activity.this,feeduser105.class);
                startActivity(intent);
            }
        });
        _btnClick65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User4Activity.this,docuser5.class);
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
                Toast.makeText(User4Activity.this, "Info has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(User4Activity.this, "Sharing has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(User4Activity.this, "Bluetooth has been pressed", Toast.LENGTH_SHORT).show();
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