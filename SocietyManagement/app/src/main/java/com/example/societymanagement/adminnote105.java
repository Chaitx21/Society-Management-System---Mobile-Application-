package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adminnote105 extends AppCompatActivity {

    private String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminnote105);
    }

    public void sm5(View view) {

        Intent intent = new Intent(this, usernote105.class);
        EditText editText = (EditText)findViewById(R.id.edu5);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Toast.makeText(this, "Msg Send To User105", Toast.LENGTH_SHORT).show();
    }
}