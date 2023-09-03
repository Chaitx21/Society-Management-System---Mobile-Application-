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

public class adminbill104 extends AppCompatActivity {


    private static final String TAG = "adminbill104";

    private static final String KEY_WATERBILL = "waterbill";
    private static final String KEY_PARKINGBILL = "parkingbill";
    private static final String KEY_EVENTFUND = "eventfund";
    private static final String KEY_SERVICECHARGE = "servicecharge";
    private static final String KEY_TOTAL = "total";
    private static final String KEY_PAID = "paid";
    private static final String KEY_BALANCE = "balance";

    private EditText edit22;
    private EditText edit23;
    private EditText edit24;
    private EditText edit25;
    private EditText edit26;
    private EditText edit27;
    private EditText edit28;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("Bill Details/Flat 104");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminbill104);

        edit22 = findViewById(R.id.edit22);
        edit23 = findViewById(R.id.edit23);
        edit24 = findViewById(R.id.edit24);
        edit25 = findViewById(R.id.edit25);
        edit26 = findViewById(R.id.edit26);
        edit27 = findViewById(R.id.edit27);
        edit28 = findViewById(R.id.edit28);
    }

    public void add(View view) {
        String waterbill = edit22.getText().toString();
        String parkingbill = edit23.getText().toString();
        String eventfund = edit24.getText().toString();
        String servicecharge = edit25.getText().toString();
        String total = edit26.getText().toString();
        String paid = edit27.getText().toString();
        String balance = edit28.getText().toString();

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
                        Toast.makeText(adminbill104.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminbill104.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String waterbill = edit22.getText().toString();
        String parkingbill = edit23.getText().toString();
        String eventfund = edit24.getText().toString();
        String servicecharge = edit25.getText().toString();
        String total = edit26.getText().toString();
        String paid = edit27.getText().toString();
        String balance = edit28.getText().toString();

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