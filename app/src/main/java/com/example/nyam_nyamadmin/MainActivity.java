package com.example.nyam_nyamadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Locale;

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
        Firestore.collection("Order").document("ZLIfAvO1DJN16r4AiFLi").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String table = documentSnapshot.getString("Table");
                if (Integer.parseInt(table) == 1){
                    table1.setBackgroundColor(getResources().getColor(R.color.green));
                }
                if (Integer.parseInt(table) == 2){
                    table2.setBackgroundColor(getResources().getColor(R.color.green));
                }
                if (Integer.parseInt(table) == 3){
                    table3.setBackgroundColor(getResources().getColor(R.color.green));
                }
                if (Integer.parseInt(table) == 4){
                    table4.setBackgroundColor(getResources().getColor(R.color.green));
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

    public void table1(View view){
        Intent i = new Intent(MainActivity.this, Table1.class);
        startActivity(i);
    }
    public void translate_rus(View view) {
        ImageButton cart_USA2=findViewById(R.id.translate_usa);
        ImageButton cart_rus2=findViewById(R.id.translate_rus);
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();
        cart_rus2.setVisibility(View.GONE);
        cart_USA2.setVisibility(View.VISIBLE);
    }
    public void translate_usa(View view) {
        ImageButton cart_USA=findViewById(R.id.translate_usa);
        ImageButton cart_rus=findViewById(R.id.translate_rus);
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        recreate();
        cart_rus.setVisibility(View.VISIBLE);
        cart_USA.setVisibility(View.GONE);
    }


}