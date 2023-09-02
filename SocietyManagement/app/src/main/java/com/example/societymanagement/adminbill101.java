package com.example.societymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class adminbill101 extends AppCompatActivity {

    private static final String TAG = "adminbill101";

    private static final String KEY_WATERBILL = "waterbill";
    private static final String KEY_PARKINGBILL = "parkingbill";
    private static final String KEY_EVENTFUND = "eventfund";
    private static final String KEY_SERVICECHARGE = "servicecharge";
    private static final String KEY_TOTAL = "total";
    private static final String KEY_PAID = "paid";
    private static final String KEY_BALANCE = "balance";

    private EditText edit1;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private EditText edit5;
    private EditText edit6;
    private EditText edit7;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("Bill Details/Flat 101");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminbill101);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);
        edit5 = findViewById(R.id.edit5);
        edit6 = findViewById(R.id.edit6);
        edit7 = findViewById(R.id.edit7);

    }

    public void add(View view) {
        String waterbill = edit1.getText().toString();
        String parkingbill = edit2.getText().toString();
        String eventfund = edit3.getText().toString();
        String servicecharge = edit4.getText().toString();
        String total = edit5.getText().toString();
        String paid = edit6.getText().toString();
        String balance = edit7.getText().toString();

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
                        Toast.makeText(adminbill101.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminbill101.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String waterbill = edit1.getText().toString();
        String parkingbill = edit2.getText().toString();
        String eventfund = edit3.getText().toString();
        String servicecharge = edit4.getText().toString();
        String total = edit5.getText().toString();
        String paid = edit6.getText().toString();
        String balance = edit7.getText().toString();

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