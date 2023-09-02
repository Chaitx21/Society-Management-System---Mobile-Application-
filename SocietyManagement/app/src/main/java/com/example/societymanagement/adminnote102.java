package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adminnote102 extends AppCompatActivity {

    private String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminnote102);

    }

    public void sm2(View view) {
        Intent intent = new Intent(this, usernote102.class);
        EditText editText = (EditText)findViewById(R.id.edu2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Toast.makeText(this, "Msg Send To User102", Toast.LENGTH_SHORT).show();
    }
}