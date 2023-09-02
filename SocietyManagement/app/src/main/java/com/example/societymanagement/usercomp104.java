package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class usercomp104 extends AppCompatActivity {

    private String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usercomp104);
    }

    public void sms4(View view) {
        Intent intent = new Intent(this, admincomp104.class);
        EditText editText = (EditText)findViewById(R.id.eedd4);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Toast.makeText(this, "Msg Send To Admin104", Toast.LENGTH_SHORT).show();
    }
}