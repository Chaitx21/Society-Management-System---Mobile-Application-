package com.example.societymanagement;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class adminflat103 extends AppCompatActivity {

    private static final String TAG = "adminflat103";

    private static final String KEY_FLATAREA = "flatarea";
    private static final String KEY_FLATTYPE = "flattype";
    private static final String KEY_FLATFLOOR = "flatfloor";
    private static final String KEY_EMAILID = "emailid";

    private EditText ed9;
    private EditText ed10;
    private EditText ed11;
    private EditText ed12;
    private TextView t3;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("Flat Details/Flat 103");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminflat103);

        ed9 = findViewById(R.id.ed9);
        ed10 = findViewById(R.id.ed10);
        ed11 = findViewById(R.id.ed11);
        ed12 = findViewById(R.id.ed12);
        t3 = findViewById(R.id.t3);
    }

    public void add(View view) {
        String flatarea = ed9.getText().toString();
        String flattype = ed10.getText().toString();
        String flatfloor = ed11.getText().toString();
        String email = ed12.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_FLATAREA,flatarea);
        note.put(KEY_FLATTYPE,flattype);
        note.put(KEY_FLATFLOOR,flatfloor);
        note.put(KEY_EMAILID,email);

        noteRef.set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(adminflat103.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminflat103.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String flatarea = ed9.getText().toString();
        String flattype = ed10.getText().toString();
        String flatfloor = ed11.getText().toString();
        String email = ed12.getText().toString();

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

                            t3.setText("FLATAREA: " + flatarea + "\n" + "FLATTYPE: " + flattype + "\n" + "FLATFLOOR: " + flatfloor + "\n" + "EMAILID: " + email);
                        }else{
                            Toast.makeText(adminflat103.this, "Data Does Not Exist", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminflat103.this, "", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }
}