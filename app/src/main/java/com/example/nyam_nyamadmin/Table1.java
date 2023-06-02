package com.example.nyam_nyamadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class Table1 extends AppCompatActivity {
    private DatabaseReference mDatabase;
    FirebaseFirestore Firestore;
    TextView meat_n;
    TextView cheese_n;
    TextView marinade_n;
    TextView mikado_n;
    TextView napoleon_n;
    TextView donut_n;
    TextView arabia_n;
    TextView cappuchino_n;
    TextView latte_n;
    TextView caprese_n;
    TextView caesar_n;
    TextView vegetable_n;
    TextView french_n;
    TextView hot_dog_n;
    TextView burger_n;
    TextView cola_n;
    TextView fanta_n;
    TextView sprite_n;
    TextView water_n;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);
        meat_n = findViewById(R.id.meat_tt);
        cheese_n = findViewById(R.id.chesse_tt);
        marinade_n = findViewById(R.id.marinade_tt);
        mikado_n = findViewById(R.id.mikado_tt);
        napoleon_n = findViewById(R.id.napleon_tt);
        donut_n = findViewById(R.id.donut_tt);
        arabia_n = findViewById(R.id.arabia_tt);
        cappuchino_n = findViewById(R.id.cappuchino_tt);
        latte_n = findViewById(R.id.latte_tt);
        caprese_n = findViewById(R.id.caprese_tt);
        caesar_n = findViewById(R.id.caesar_tt);
        vegetable_n = findViewById(R.id.vegetable_tt);
        french_n = findViewById(R.id.french_tt);
        hot_dog_n = findViewById(R.id.hot_dog_tt);
        burger_n = findViewById(R.id.burger_tt);
        cola_n = findViewById(R.id.cola_tt);
        fanta_n = findViewById(R.id.fanta_tt);
        sprite_n = findViewById(R.id.sprite_tt);
        water_n = findViewById(R.id.water_tt);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Firestore = FirebaseFirestore.getInstance();
        Firestore.collection("Order").document("KO8wyP48r8CC7MflFngR").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String meat = documentSnapshot.getString("Meat Snack");
                String cheese = documentSnapshot.getString("Cheese");
                String marinade = documentSnapshot.getString("Marinade");
                String mikado = documentSnapshot.getString("Mikado");
                String napoleon = documentSnapshot.getString("Napoleon");
                String donut = documentSnapshot.getString("Donut");
                String arabia = documentSnapshot.getString("Arabia Coffee");
                String cappuchino = documentSnapshot.getString("Cappuccino");
                String latte = documentSnapshot.getString("Latte");
                String caprese = documentSnapshot.getString("Caprese");
                String caesar = documentSnapshot.getString("Caesar");
                String vegetable = documentSnapshot.getString("Vegetable salad");
                String french = documentSnapshot.getString("French fries");
                String hot_dog = documentSnapshot.getString("Hot dog");
                String burger = documentSnapshot.getString("Beef burger");
                String cola = documentSnapshot.getString("Coca-Cola");
                String fanta = documentSnapshot.getString("Fanta");
                String sprite = documentSnapshot.getString("Sprite");
                String water = documentSnapshot.getString("Water");
                if (Integer.parseInt(meat) != 0){
                    meat_n.setText("Meat Snack---" + Integer.parseInt(meat)+"---"+Integer.parseInt(meat)*3000+"amd");
                    meat_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cheese) != 0){
                    cheese_n.setText("Cheese---" + Integer.parseInt(cheese)+"---"+Integer.parseInt(cheese)*2500+"amd");
                    cheese_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(marinade) != 0){
                    marinade_n.setText("Marinade---" + Integer.parseInt(marinade)+"---"+Integer.parseInt(marinade)*1800+"amd");
                    marinade_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(mikado) != 0){
                    mikado_n.setText("Mikado---" + Integer.parseInt(mikado)+"---"+Integer.parseInt(mikado)*550+"amd");
                    mikado_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(napoleon) != 0){
                    napoleon_n.setText("Napoleon---" + Integer.parseInt(napoleon)+"---"+Integer.parseInt(napoleon)*600+"amd");
                    napoleon_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(donut) != 0){
                    donut_n.setText("Donut---" + Integer.parseInt(donut)+"---"+Integer.parseInt(donut)*750+"amd");
                    donut_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(arabia) != 0){
                    arabia_n.setText("Arabia Coffee---" + Integer.parseInt(arabia)+"---"+Integer.parseInt(arabia)*700+"amd");
                    arabia_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cappuchino) != 0){
                    cappuchino_n.setText("Cappuccino---" + Integer.parseInt(cappuchino)+"---"+Integer.parseInt(cappuchino)*750+"amd");
                    cappuchino_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(latte) != 0){
                    latte_n.setText("Latte---" + Integer.parseInt(latte)+"---"+Integer.parseInt(latte)*1000+"amd");
                    latte_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caprese) != 0){
                    caprese_n.setText("Caprese---" + Integer.parseInt(caprese)+"---"+Integer.parseInt(caprese)*1200+"amd");
                    caprese_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caesar) != 0){
                    caesar_n.setText("Caesar---" + Integer.parseInt(caesar)+"---"+Integer.parseInt(caesar)*1000+"amd");
                    caesar_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(vegetable) != 0){
                    vegetable_n.setText("Vegetable salad---" + Integer.parseInt(vegetable)+"---"+Integer.parseInt(vegetable)*500+"amd");
                    vegetable_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(french) != 0){
                    french_n.setText("French fries---" + Integer.parseInt(french)+"---"+Integer.parseInt(french)*550+"amd");
                    french_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(hot_dog) != 0){
                    hot_dog_n.setText("Hot dog---" + Integer.parseInt(hot_dog)+"---"+Integer.parseInt(hot_dog)*800+"amd");
                    hot_dog_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(burger) != 0){
                    burger_n.setText("Beef burger---" + Integer.parseInt(burger)+"---"+Integer.parseInt(burger)*1200+"amd");
                    burger_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cola) != 0){
                    cola_n.setText("Coca-cola---" + Integer.parseInt(cola)+"---"+Integer.parseInt(cola)*500+"amd");
                    cola_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(fanta) != 0){
                    fanta_n.setText("Fanta---" + Integer.parseInt(fanta)+"---"+Integer.parseInt(fanta)*500+"amd");
                    fanta_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sprite) != 0){
                    sprite_n.setText("Sprite---" + Integer.parseInt(sprite)+"---"+Integer.parseInt(sprite)*500+"amd");
                    sprite_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(water) != 0){
                    water_n.setText("Water---" + Integer.parseInt(water)+"---"+Integer.parseInt(water)*300+"amd");
                    water_n.setVisibility(View.VISIBLE);
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Table1.this,"Fail",Toast.LENGTH_SHORT).show();
                Toast.makeText(Table1.this,e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }
}