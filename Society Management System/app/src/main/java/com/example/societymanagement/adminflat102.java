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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class adminflat102 extends AppCompatActivity {
    private static final String TAG = "adminflat102";

    private static final String KEY_FLATAREA = "flatarea";
    private static final String KEY_FLATTYPE = "flattype";
    private static final String KEY_FLATFLOOR = "flatfloor";
    private static final String KEY_EMAILID = "emailid";

    private EditText ed5;
    private EditText ed6;
    private EditText ed7;
    private EditText ed8;
    private TextView t2;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("Flat Details/Flat 102");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminflat102);

        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        t2 = findViewById(R.id.t2);
    }

    public void add(View view) {
        String flatarea = ed5.getText().toString();
        String flattype = ed6.getText().toString();
        String flatfloor = ed7.getText().toString();
        String email = ed8.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_FLATAREA,flatarea);
        note.put(KEY_FLATTYPE,flattype);
        note.put(KEY_FLATFLOOR,flatfloor);
        note.put(KEY_EMAILID,email);

        noteRef.set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(adminflat102.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminflat102.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String flatarea = ed5.getText().toString();
        String flattype = ed6.getText().toString();
        String flatfloor = ed7.getText().toString();
        String email = ed8.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_FLATAREA,flatarea);
        note.put(KEY_FLATTYPE,flattype);
        note.put(KEY_FLATFLOOR,flatfloor);
        note.put(KEY_EMAILID,email);

        //noteRef.set(note, SetOptions.merge());
        noteRef.update(note);

        Toast.makeText(this, "Data Updated Successfully", Toast.LENGTH_SHORT).show();
    }

    public void delete(View view) {
        //Map<String, Object> note = new HashMap<>();
        //note.put(KEY_FLATAREA, FieldValue.delete());
        //note.put(KEY_FLATTYPE, FieldValue.delete());
        //note.put(KEY_FLATFLOOR, FieldValue.delete());
        //note.put(KEY_EMAILID, FieldValue.delete());

        //noteRef.update(note);

        noteRef.update(KEY_FLATAREA, FieldValue.delete());
        noteRef.update(KEY_FLATTYPE, FieldValue.delete());
        noteRef.update(KEY_FLATFLOOR, FieldValue.delete());
        noteRef.update(KEY_EMAILID, FieldValue.delete());

        Toast.makeText(this, "Data Deleted Successfully", Toast.LENGTH_SHORT).show();
    }

    public void loaddata(View view) {
        noteRef.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        if (documentSnapshot.exists()){
                            String flatarea = documentSnapshot.getString(KEY_FLATAREA);
                            String flattype = documentSnapshot.getString(KEY_FLATTYPE);
                            String flatfloor = documentSnapshot.getString(KEY_FLATFLOOR);
                            String email = documentSnapshot.getString(KEY_EMAILID);

                            //Map<String, Object> note = documentSnapshot.getData();

                            t2.setText("FLATAREA: " + flatarea + "\n" + "FLATTYPE: " + flattype + "\n" + "FLATFLOOR: " + flatfloor + "\n" + "EMAILID: " + email);
                        }else{
                            Toast.makeText(adminflat102.this, "Data Does Not Exist", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminflat102.this, "", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }
}