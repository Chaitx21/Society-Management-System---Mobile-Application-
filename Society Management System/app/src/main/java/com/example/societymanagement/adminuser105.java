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


public class adminuser105 extends AppCompatActivity {

    private static final String TAG = "adminuser105";

    private static final String KEY_NAME = "name";
    private static final String KEY_MOBILENO = "mobileno";
    private static final String KEY_DOB = "dob";
    private static final String KEY_ADDRESS = "address";

    private EditText eds17;
    private EditText eds18;
    private EditText eds19;
    private EditText eds20;
    private TextView t15;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference noteRef = db.document("User Details/Flat 105");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminuser105);

        eds17 = findViewById(R.id.eds17);
        eds18 = findViewById(R.id.eds18);
        eds19 = findViewById(R.id.eds19);
        eds20 = findViewById(R.id.eds20);
        t15 = findViewById(R.id.t15);
    }

    public void add(View view) {
        String name = eds17.getText().toString();
        String mobileno = eds18.getText().toString();
        String dob = eds19.getText().toString();
        String address = eds20.getText().toString();

        Map<String, Object> note = new HashMap<>();
        note.put(KEY_NAME,name);
        note.put(KEY_MOBILENO,mobileno);
        note.put(KEY_DOB,dob);
        note.put(KEY_ADDRESS,address);

        noteRef.set(note)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(adminuser105.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminuser105.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,e.toString());
                    }
                });
    }

    public void update(View view) {
        String name = eds17.getText().toString();
        String mobileno = eds18.getText().toString();
        String dob = eds19.getText().toString();
        String address = eds20.getText().toString();

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

                            t15.setText("NAME: " + name + "\n" + "MOBILENO: " + mobileno + "\n" + "DOB: " + dob + "\n" + "ADDRESS: " + address);
                        } else {
                            Toast.makeText(adminuser105.this, "Data Does Not Exist", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(adminuser105.this, "", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, e.toString());
                    }
                });
    }
}