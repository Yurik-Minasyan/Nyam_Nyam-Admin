package com.example.nyam_nyamadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
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
    TextView sum_n;
    TextView meat_n2;
    TextView cheese_n2;
    TextView marinade_n2;
    TextView mikado_n2;
    TextView napoleon_n2;
    TextView donut_n2;
    TextView arabia_n2;
    TextView cappuchino_n2;
    TextView latte_n2;
    TextView caprese_n2;
    TextView caesar_n2;
    TextView vegetable_n2;
    TextView french_n2;
    TextView hot_dog_n2;
    TextView burger_n2;
    TextView cola_n2;
    TextView fanta_n2;
    TextView sprite_n2;
    TextView water_n2;
    TextView sum_n2;
    ImageView print;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);
        meat_n = findViewById(R.id.meat_tt);
        print = findViewById(R.id.print);
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
        sum_n = findViewById(R.id.sum_tt);
        meat_n2 = findViewById(R.id.meat_tt2);
        cheese_n2 = findViewById(R.id.chesse_tt2);
        marinade_n2 = findViewById(R.id.marinade_tt2);
        mikado_n2 = findViewById(R.id.mikado_tt2);
        napoleon_n2 = findViewById(R.id.napleon_tt2);
        donut_n2 = findViewById(R.id.donut_tt2);
        arabia_n2 = findViewById(R.id.arabia_tt2);
        cappuchino_n2 = findViewById(R.id.cappuchino_tt2);
        latte_n2 = findViewById(R.id.latte_tt2);
        caprese_n2 = findViewById(R.id.caprese_tt2);
        caesar_n2 = findViewById(R.id.caesar_tt2);
        vegetable_n2 = findViewById(R.id.vegetable_tt2);
        french_n2 = findViewById(R.id.french_tt2);
        hot_dog_n2 = findViewById(R.id.hot_dog_tt2);
        burger_n2 = findViewById(R.id.burger_tt2);
        cola_n2 = findViewById(R.id.cola_tt2);
        fanta_n2= findViewById(R.id.fanta_tt2);
        sprite_n2 = findViewById(R.id.sprite_tt2);
        water_n2 = findViewById(R.id.water_tt2);
        sum_n2 = findViewById(R.id.sum_tt2);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Firestore = FirebaseFirestore.getInstance();
        Firestore.collection("Order").document("Table1").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
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
                String sum = documentSnapshot.getString("Total");
                if (Integer.parseInt(meat) != 0){
                    meat_n.setText(R.string.meat);
                    meat_n2.setText(" " + Integer.parseInt(meat)+"---"+Integer.parseInt(meat)*3000+"amd");
                    meat_n.setVisibility(View.VISIBLE);
                    meat_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cheese) != 0){
                    cheese_n.setText(R.string.cheese);
                    cheese_n2.setText(" " + Integer.parseInt(cheese)+"---"+Integer.parseInt(cheese)*2500+"amd");
                    cheese_n.setVisibility(View.VISIBLE);
                    cheese_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(marinade) != 0){
                    marinade_n.setText(R.string.marinade );
                    marinade_n2.setText(" "+ Integer.parseInt(marinade)+"---"+Integer.parseInt(marinade)*1800+"amd");
                    marinade_n.setVisibility(View.VISIBLE);
                    marinade_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(mikado) != 0){
                    mikado_n.setText(R.string.mikado);
                    mikado_n2.setText(" "+ Integer.parseInt(mikado)+"---"+Integer.parseInt(mikado)*550+"amd");
                    mikado_n.setVisibility(View.VISIBLE);
                    mikado_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(napoleon) != 0){
                    napoleon_n.setText(R.string.napoleon);
                    napoleon_n2.setText( " "+ Integer.parseInt(napoleon)+"---"+Integer.parseInt(napoleon)*600+"amd");
                    napoleon_n.setVisibility(View.VISIBLE);
                    napoleon_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(donut) != 0){
                    donut_n.setText(R.string.donut);
                    donut_n2.setText( + Integer.parseInt(donut)+"---"+Integer.parseInt(donut)*750+"amd");
                    donut_n.setVisibility(View.VISIBLE);
                    donut_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(arabia) != 0){
                    arabia_n.setText(R.string.arabia);
                    arabia_n2.setText( " "+ Integer.parseInt(arabia)+"---"+Integer.parseInt(arabia)*700+"amd");
                    arabia_n.setVisibility(View.VISIBLE);
                    arabia_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cappuchino) != 0){
                    cappuchino_n.setText(R.string.cappuchino);
                    cappuchino_n2.setText(" " + Integer.parseInt(cappuchino)+"---"+Integer.parseInt(cappuchino)*750+"amd");
                    cappuchino_n.setVisibility(View.VISIBLE);
                    cappuchino_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(latte) != 0){
                    latte_n.setText(R.string.latte);
                    latte_n2.setText(" " + Integer.parseInt(latte)+"---"+Integer.parseInt(latte)*1000+"amd");
                    latte_n.setVisibility(View.VISIBLE);
                    latte_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caprese) != 0){
                    caprese_n.setText(R.string.caprese);
                    caprese_n2.setText(" " + Integer.parseInt(caprese)+"---"+Integer.parseInt(caprese)*1200+"amd");
                    caprese_n.setVisibility(View.VISIBLE);
                    caprese_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caesar) != 0){
                    caesar_n.setText(R.string.caesar);
                    caesar_n2.setText(" " + Integer.parseInt(caesar)+"---"+Integer.parseInt(caesar)*1000+"amd");
                    caesar_n.setVisibility(View.VISIBLE);
                    caesar_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(vegetable) != 0){
                    vegetable_n.setText(R.string.vegetable);
                    vegetable_n2.setText(" " + Integer.parseInt(vegetable)+"---"+Integer.parseInt(vegetable)*500+"amd");
                    vegetable_n.setVisibility(View.VISIBLE);
                    vegetable_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(french) != 0){
                    french_n.setText(R.string.french_fries);
                    french_n2.setText(" " + Integer.parseInt(french)+"---"+Integer.parseInt(french)*550+"amd");
                    french_n.setVisibility(View.VISIBLE);
                    french_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(hot_dog) != 0){
                    hot_dog_n.setText(R.string.hot_dog);
                    hot_dog_n2.setText(" " + Integer.parseInt(hot_dog)+"---"+Integer.parseInt(hot_dog)*800+"amd");
                    hot_dog_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(burger) != 0){
                    burger_n.setText(R.string.burger);
                    burger_n2.setText(" " + Integer.parseInt(burger)+"---"+Integer.parseInt(burger)*1200+"amd");
                    burger_n.setVisibility(View.VISIBLE);
                    burger_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cola) != 0){
                    cola_n.setText(R.string.coca);
                    cola_n2.setText(" "+  Integer.parseInt(cola)+"---"+Integer.parseInt(cola)*500+"amd");
                    cola_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(fanta) != 0){
                    fanta_n.setText(R.string.fanta);
                    fanta_n2.setText(" " + Integer.parseInt(fanta)+"---"+Integer.parseInt(fanta)*500+"amd");
                    fanta_n2.setVisibility(View.VISIBLE);
                    fanta_n.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sprite) != 0){
                    sprite_n.setText(R.string.sprite);
                    sprite_n2.setText(" " + Integer.parseInt(sprite)+"---"+Integer.parseInt(sprite)*500+"amd");
                    sprite_n.setVisibility(View.VISIBLE);
                    sprite_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(water) != 0){
                    water_n.setText(R.string.water);
                    water_n2.setText(" " + Integer.parseInt(water)+"---"+Integer.parseInt(water)*300+"amd");
                    water_n.setVisibility(View.VISIBLE);
                    water_n2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sum) != 0){
                    sum_n.setText(R.string.total);
                    sum_n2.setText(" " + Integer.parseInt(sum) + "amd");
                    sum_n.setVisibility(View.VISIBLE);
                    sum_n2.setVisibility(View.VISIBLE);
                    print.setVisibility(View.VISIBLE);
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
    public void print(View view){
        Toast.makeText(Table1.this,R.string.print,Toast.LENGTH_LONG).show();
    }
    public void home_1(View view){
        Intent i = new Intent(Table1.this, MainActivity.class);
        startActivity(i);
    }
}