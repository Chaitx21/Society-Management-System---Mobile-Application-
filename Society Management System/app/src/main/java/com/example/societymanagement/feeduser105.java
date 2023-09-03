package com.example.societymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class feeduser105 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeduser105);

        //EditText,TextView,button-
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.editText1);
                EditText editTextEmail = findViewById(R.id.editText2);
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                TextView textView = findViewById(R.id.textViewResult);
                textView.setText("Name :- "+name+"\n"+"Email :- "+email);
            }
        });

        //RadioGroup,RadioButton-
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(feeduser105.this, "Gender is: "+ radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        //RatingBar-
        Button buttonSubmitRating = findViewById(R.id.submitRating);
        buttonSubmitRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RatingBar ratingBar = findViewById(R.id.ratingBar);
                float ratingValue = ratingBar.getRating();
                String ratingText = String.valueOf(ratingValue);
                Toast.makeText(feeduser105.this, "Rating Value is "+ratingText, Toast.LENGTH_SHORT).show();
            }
        });

        //CheckBox-
        CheckBox checkBox = findViewById(R.id.checkBoxRed);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(feeduser105.this,"True", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(feeduser105.this,"False", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}