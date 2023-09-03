package com.example.societymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class adminbill105 extends AppCompatActivity {

    private static final String TAG = "adminbill105";

    private static final String KEY_WATERBILL = "waterbill";
    private static final String KEY_PARKINGBILL = "parkingbill";
    private static final String KEY_EVENTFUND = "eventfund";
    private static final String KEY_SERVICECHARGE = "servicecharge";
    private static final String KEY_TOTAL = "total";
    private static final String KEY_PAID = "paid";
    private static final String KEY_BALANCE = "balance";

    private EditText edit29;
    private EditText edit30;
    private EditText edit31;
    private EditText edit32;
    private EditText edit33;
    private EditText edit34;
    private EditText edit35;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("Bill Details/Flat 105");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminbill105);

        edit29 = findViewById(R.id.edit29);
        edit30 = findViewById(R.id.edit30);
        edit31 = findViewById(R.id.edit31);
        edit32 = findViewById(R.id.edit32);
        edit33 = findViewById(R.id.edit33);
        edit34 = findViewById(R.id.edit34);
        edit35 = findViewById(R.id.edit35);
    }

    public void add(View view) {
        String waterbill = edit29.getText().toString();
        String parkingbill = edit30.getText().toString();
        String eventfund = edit31.getText().toString();
        String servicecharge = edit32.getText().toString();
        String total = edit33.getText().toString();
        String paid = edit34.getText().toString();
        String balance = edit35.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_WATERBILL,waterbill);
        note.put(KEY_PARKINGBILL,parkingbill);
        note.put(KEY_EVENTFUND,eventfund);
        note.put(KEY_SERVICECHARGE,servicecharge);
        note.put(KEY_TOTAL,total);
        note.put(KEY_PAID,paid);
        note.put(KEY_BALANCE,balance);


        noteRef.set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(adminbill105.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminbill105.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String waterbill = edit29.getText().toString();
        String parkingbill = edit30.getText().toString();
        String eventfund = edit31.getText().toString();
        String servicecharge = edit32.getText().toString();
        String total = edit33.getText().toString();
        String paid = edit34.getText().toString();
        String balance = edit35.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_WATERBILL,waterbill);
        note.put(KEY_PARKINGBILL,parkingbill);
        note.put(KEY_EVENTFUND,eventfund);
        note.put(KEY_SERVICECHARGE,servicecharge);
        note.put(KEY_TOTAL,total);
        note.put(KEY_PAID,paid);
        note.put(KEY_BALANCE,balance);

        //noteRef.set(note, SetOptions.merge());
        noteRef.update(note);

        Toast.makeText(this, "Data Updated Successfully", Toast.LENGTH_SHORT).show();
    }

    public void delete(View view) {
        //Map<String, Object> note = new HashMap<>();
        //note.put(KEY_NAME, FieldValue.delete());
        //note.put(KEY_MOBILENO, FieldValue.delete());
        //note.put(KEY_DOB, FieldValue.delete());
        //note.put(KEY_ADDRESS, FieldValue.delete());

        //noteRef.update(note);

        noteRef.update(KEY_WATERBILL, FieldValue.delete());
        noteRef.update(KEY_PARKINGBILL, FieldValue.delete());
        noteRef.update(KEY_EVENTFUND, FieldValue.delete());
        noteRef.update(KEY_SERVICECHARGE, FieldValue.delete());
        noteRef.update(KEY_TOTAL, FieldValue.delete());
        noteRef.update(KEY_PAID, FieldValue.delete());
        noteRef.update(KEY_BALANCE, FieldValue.delete());
    }
}