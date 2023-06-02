package com.example.nyam_nyamadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView table;
    Button table1;
    Button table2;
    Button table3;
    Button table4;
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
//        table1.setBackgroundColor(getResources().getColor(R.color.green));
    }
}