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

public class User2Activity extends AppCompatActivity {
    Button _btnClick19;
    Button _btnClick20;
    Button _btnClick21;
    Button _btnClick22;
    Button _btnClick53;
    Button _btnClick63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);
        _btnClick19=(Button)findViewById(R.id.btnClick19);
        _btnClick20=(Button)findViewById(R.id.btnClick20);
        _btnClick21=(Button)findViewById(R.id.btnClick21);
        _btnClick22=(Button)findViewById(R.id.btnClick22);
        _btnClick53=(Button)findViewById(R.id.btnClick53);
        _btnClick63=(Button)findViewById(R.id.btnClick63);
        _btnClick19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User2Activity.this,useraddup103.class);
                startActivity(intent);
            }
        });
        _btnClick20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User2Activity.this,userbill103.class);
                startActivity(intent);
            }
        });
        _btnClick21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User2Activity.this,usercomp103.class);
                startActivity(intent);
            }
        });
        _btnClick22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User2Activity.this,usernote103.class);
                startActivity(intent);
            }
        });
        _btnClick53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User2Activity.this,feeduser103.class);
                startActivity(intent);
            }
        });
        _btnClick63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User2Activity.this,docuser3.class);
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
                Toast.makeText(User2Activity.this, "Info has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(User2Activity.this, "Sharing has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(User2Activity.this, "Bluetooth has been pressed", Toast.LENGTH_SHORT).show();
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