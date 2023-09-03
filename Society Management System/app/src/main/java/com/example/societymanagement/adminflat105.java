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
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class adminflat105 extends AppCompatActivity {

    private static final String TAG = "adminflat105";

    private static final String KEY_FLATAREA = "flatarea";
    private static final String KEY_FLATTYPE = "flattype";
    private static final String KEY_FLATFLOOR = "flatfloor";
    private static final String KEY_EMAILID = "emailid";

    private EditText ed17;
    private EditText ed18;
    private EditText ed19;
    private EditText ed20;
    private TextView t5;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("Flat Details/Flat 105");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminflat105);

        ed17 = findViewById(R.id.ed17);
        ed18 = findViewById(R.id.ed18);
        ed19 = findViewById(R.id.ed19);
        ed20 = findViewById(R.id.ed20);
        t5 = findViewById(R.id.t5);
    }

    public void add(View view) {
        String flatarea = ed17.getText().toString();
        String flattype = ed18.getText().toString();
        String flatfloor = ed19.getText().toString();
        String email = ed20.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_FLATAREA,flatarea);
        note.put(KEY_FLATTYPE,flattype);
        note.put(KEY_FLATFLOOR,flatfloor);
        note.put(KEY_EMAILID,email);

        noteRef.set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(adminflat105.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminflat105.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String flatarea = ed17.getText().toString();
        String flattype = ed18.getText().toString();
        String flatfloor = ed19.getText().toString();
        String email = ed20.getText().toString();

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

                            t5.setText("FLATAREA: " + flatarea + "\n" + "FLATTYPE: " + flattype + "\n" + "FLATFLOOR: " + flatfloor + "\n" + "EMAILID: " + email);
                        }else{
                            Toast.makeText(adminflat105.this, "Data Does Not Exist", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminflat105.this, "", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }
}