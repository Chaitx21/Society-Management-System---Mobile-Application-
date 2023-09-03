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

public class adminuser101 extends AppCompatActivity {

    private static final String TAG = "adminuser101";

    private static final String KEY_NAME = "name";
    private static final String KEY_MOBILENO = "mobileno";
    private static final String KEY_DOB = "dob";
    private static final String KEY_ADDRESS = "address";

    private EditText eds1;
    private EditText eds2;
    private EditText eds3;
    private EditText eds4;
    private TextView t11;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("User Details/Flat 101");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminuser101);

        eds1 = findViewById(R.id.eds1);
        eds2 = findViewById(R.id.eds2);
        eds3 = findViewById(R.id.eds3);
        eds4 = findViewById(R.id.eds4);
        t11 = findViewById(R.id.t11);
    }

    public void add(View view) {
        String name = eds1.getText().toString();
        String mobileno = eds2.getText().toString();
        String dob = eds3.getText().toString();
        String address = eds4.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_NAME,name);
        note.put(KEY_MOBILENO,mobileno);
        note.put(KEY_DOB,dob);
        note.put(KEY_ADDRESS,address);

        noteRef.set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(adminuser101.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminuser101.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String name = eds1.getText().toString();
        String mobileno = eds2.getText().toString();
        String dob = eds3.getText().toString();
        String address = eds4.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_NAME,name);
        note.put(KEY_MOBILENO,mobileno);
        note.put(KEY_DOB,dob);
        note.put(KEY_ADDRESS,address);

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

        noteRef.update(KEY_NAME, FieldValue.delete());
        noteRef.update(KEY_MOBILENO, FieldValue.delete());
        noteRef.update(KEY_DOB, FieldValue.delete());
        noteRef.update(KEY_ADDRESS, FieldValue.delete());
    }

    public void loaddata(View view) {
        noteRef.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        if (documentSnapshot.exists()) {
                            String name = documentSnapshot.getString(KEY_NAME);
                            String mobileno = documentSnapshot.getString(KEY_MOBILENO);
                            String dob = documentSnapshot.getString(KEY_DOB);
                            String address = documentSnapshot.getString(KEY_ADDRESS);

                            //Map<String, Object> note = documentSnapshot.getData();

                            t11.setText("NAME: " + name + "\n" + "MOBILENO: " + mobileno + "\n" + "DOB: " + dob + "\n" + "ADDRESS: " + address);
                        } else {
                            Toast.makeText(adminuser101.this, "Data Does Not Exist", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminuser101.this, "", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, e.toString());
                    }
                });

        }
    }
