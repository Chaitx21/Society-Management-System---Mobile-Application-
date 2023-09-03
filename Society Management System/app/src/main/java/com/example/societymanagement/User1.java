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

public class User1 extends AppCompatActivity {
    Button _btnClick15;
    Button _btnClick16;
    Button _btnClick17;
    Button _btnClick18;
    Button _btnClick52;
    Button _btnClick62;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1);
        _btnClick15=(Button)findViewById(R.id.btnClick15);
        _btnClick16=(Button)findViewById(R.id.btnClick16);
        _btnClick17=(Button)findViewById(R.id.btnClick17);
        _btnClick18=(Button)findViewById(R.id.btnClick18);
        _btnClick52=(Button)findViewById(R.id.btnClick52);
        _btnClick62=(Button)findViewById(R.id.btnClick62);
        _btnClick15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User1.this,useraddup102.class);
                startActivity(intent);
            }
        });
        _btnClick16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User1.this,userbill102.class);
                startActivity(intent);
            }
        });
        _btnClick17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User1.this,usercomp102.class);
                startActivity(intent);
            }
        });
        _btnClick18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User1.this,usernote102.class);
                startActivity(intent);
            }
        });
        _btnClick52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User1.this,feeduser102.class);
                startActivity(intent);
            }
        });
        _btnClick62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User1.this,docuser2.class);
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
                Toast.makeText(User1.this, "Info has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(User1.this, "Sharing has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(User1.this, "Bluetooth has been pressed", Toast.LENGTH_SHORT).show();
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