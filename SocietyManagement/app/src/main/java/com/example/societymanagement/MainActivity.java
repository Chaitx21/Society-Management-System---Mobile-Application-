package com.example.societymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText _txtUser, _txtPass;
    Button _btnLogin;
    Spinner _spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _txtPass=(EditText)findViewById(R.id.txtPass);
        _txtUser=(EditText)findViewById(R.id.txtUser);
        _btnLogin=(Button)findViewById(R.id.btnLogin);
        _spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource( this,R.array.usertype, R.layout.support_simple_spinner_dropdown_item);
        _spinner.setAdapter(adapter);
        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = _spinner.getSelectedItem().toString();
                if (_txtUser.getText().toString().equals("Secretary") && _txtPass.getText().toString().equals("sec123") && item.equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, admin.class);
                    startActivity(intent);


                }
                else if (_txtUser.getText().toString().equals("Flat 101") && _txtPass.getText().toString().equals("f1") && item.equals("user")) {
                    Intent intent = new Intent(MainActivity.this, user.class);
                    startActivity(intent);

                }
                else if (_txtUser.getText().toString().equals("Flat 102") && _txtPass.getText().toString().equals("f2") && item.equals("user")) {
                    Intent intent = new Intent(MainActivity.this, User1.class);
                    startActivity(intent);

                }
                else if (_txtUser.getText().toString().equals("Flat 103") && _txtPass.getText().toString().equals("f3") && item.equals("user")) {
                    Intent intent = new Intent(MainActivity.this, User2Activity.class);
                    startActivity(intent);

                }
                else if (_txtUser.getText().toString().equals("Flat 104") && _txtPass.getText().toString().equals("f4") && item.equals("user")) {
                    Intent intent = new Intent(MainActivity.this, User3Activity.class);
                    startActivity(intent);

                }
                else if (_txtUser.getText().toString().equals("Flat 105") && _txtPass.getText().toString().equals("f5") && item.equals("user")) {
                    Intent intent = new Intent(MainActivity.this, User4Activity.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Login Unsuccessful", Toast.LENGTH_LONG).show();
                }
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
                Toast.makeText(MainActivity.this, "Info has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(MainActivity.this, "Sharing has been pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(MainActivity.this, "Bluetooth has been pressed", Toast.LENGTH_SHORT).show();
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
