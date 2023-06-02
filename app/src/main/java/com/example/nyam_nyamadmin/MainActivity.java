package com.example.nyam_nyamadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    TextView table;
    Button table1;
    Button table2;
    Button table3;
    Button table4;
    private DatabaseReference mDatabase;
    FirebaseFirestore Firestore;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        table=findViewById(R.id.table);
        table1 = findViewById(R.id.table1);
        table2 = findViewById(R.id.table2);
        table3 = findViewById(R.id.table3);
        table4 = findViewById(R.id.table4);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Firestore = FirebaseFirestore.getInstance();
        Firestore.collection("Order").document("dMGM3or0ycKo2UUkJ4tD").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String table = documentSnapshot.getString("Table");
                String total = documentSnapshot.getString("Total");
                if (Integer.parseInt(table) == 0){
                    table1.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
            }
        });
//        table1.setBackgroundColor(getResources().getColor(R.color.green));
    }
}