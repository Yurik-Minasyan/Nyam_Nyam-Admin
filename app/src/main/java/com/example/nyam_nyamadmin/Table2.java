package com.example.nyam_nyamadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class Table2 extends AppCompatActivity {
    private DatabaseReference mDatabase;
    FirebaseFirestore Firestore;
    TextView meat_n_t2;
    TextView cheese_n_t2;
    TextView marinade_n_t2;
    TextView mikado_n_t2;
    TextView napoleon_n_t2;
    TextView donut_n_t2;
    TextView arabia_n_t2;
    TextView cappuchino_n_t2;
    TextView latte_n_t2;
    TextView caprese_n_t2;
    TextView caesar_n_t2;
    TextView vegetable_n_t2;
    TextView french_n_t2;
    TextView hot_dog_n_t2;
    TextView burger_n_t2;
    TextView cola_n_t2;
    TextView fanta_n_t2;
    TextView sprite_n_t2;
    TextView water_n_t2;
    TextView sum_n_t2;
    TextView meat_n2_t2;
    TextView cheese_n2_t2;
    TextView marinade_n2_t2;
    TextView mikado_n2_t2;
    TextView napoleon_n2_t2;
    TextView donut_n2_t2;
    TextView arabia_n2_t2;
    TextView cappuchino_n2_t2;
    TextView latte_n2_t2;
    TextView caprese_n2_t2;
    TextView caesar_n2_t2;
    TextView vegetable_n2_t2;
    TextView french_n2_t2;
    TextView hot_dog_n2_t2;
    TextView burger_n2_t2;
    TextView cola_n2_t2;
    TextView fanta_n2_t2;
    TextView sprite_n2_t2;
    TextView water_n2_t2;
    TextView sum_n2_t2;
    ImageView print_t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);
        meat_n_t2 = findViewById(R.id.meat_tt_t2);
        print_t2 = findViewById(R.id.print_t2);
        cheese_n_t2 = findViewById(R.id.chesse_tt_t2);
        marinade_n_t2 = findViewById(R.id.marinade_tt_t2);
        mikado_n_t2= findViewById(R.id.mikado_tt_t2);
        napoleon_n_t2 = findViewById(R.id.napleon_tt_t2);
        donut_n_t2 = findViewById(R.id.donut_tt_t2);
        arabia_n_t2 = findViewById(R.id.arabia_tt_t2);
        cappuchino_n_t2 = findViewById(R.id.cappuchino_tt_t2);
        latte_n_t2 = findViewById(R.id.latte_tt_t2);
        caprese_n_t2 = findViewById(R.id.caprese_tt_t2);
        caesar_n_t2 = findViewById(R.id.caesar_tt_t2);
        vegetable_n_t2 = findViewById(R.id.vegetable_tt_t2);
        french_n_t2 = findViewById(R.id.french_tt_t2);
        hot_dog_n_t2 = findViewById(R.id.hot_dog_tt_t2);
        burger_n_t2 = findViewById(R.id.burger_tt_t2);
        cola_n_t2 = findViewById(R.id.cola_tt_t2);
        fanta_n_t2= findViewById(R.id.fanta_tt_t2);
        sprite_n_t2 = findViewById(R.id.sprite_tt_t2);
        water_n_t2 = findViewById(R.id.water_tt_t2);
        sum_n_t2 = findViewById(R.id.sum_tt_t2);
        meat_n2_t2 = findViewById(R.id.meat_tt2_t2);
        cheese_n2_t2 = findViewById(R.id.chesse_tt2_t2);
        marinade_n2_t2 = findViewById(R.id.marinade_tt2_t2);
        mikado_n2_t2 = findViewById(R.id.mikado_tt2_t2);
        napoleon_n2_t2 = findViewById(R.id.napleon_tt2_t2);
        donut_n2_t2 = findViewById(R.id.donut_tt2_t2);
        arabia_n2_t2 = findViewById(R.id.arabia_tt2_t2);
        cappuchino_n2_t2 = findViewById(R.id.cappuchino_tt2_t2);
        latte_n2_t2 = findViewById(R.id.latte_tt2_t2);
        caprese_n2_t2 = findViewById(R.id.caprese_tt2_t2);
        caesar_n2_t2 = findViewById(R.id.caesar_tt2_t2);
        vegetable_n2_t2 = findViewById(R.id.vegetable_tt2_t2);
        french_n2_t2 = findViewById(R.id.french_tt2_t2);
        hot_dog_n2_t2 = findViewById(R.id.hot_dog_tt2_t2);
        burger_n2_t2 = findViewById(R.id.burger_tt2_t2);
        cola_n2_t2 = findViewById(R.id.cola_tt2_t2);
        fanta_n2_t2 = findViewById(R.id.fanta_tt2_t2);
        sprite_n2_t2 = findViewById(R.id.sprite_tt2_t2);
        water_n2_t2 = findViewById(R.id.water_tt2_t2);
        sum_n2_t2 = findViewById(R.id.sum_tt2_t2);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Firestore = FirebaseFirestore.getInstance();
        Firestore.collection("Order").document("Table2").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String meat_t2 = documentSnapshot.getString("Meat Snack");
                String cheese_t2 = documentSnapshot.getString("Cheese");
                String marinade_t2 = documentSnapshot.getString("Marinade");
                String mikado_t2 = documentSnapshot.getString("Mikado");
                String napoleon_t2 = documentSnapshot.getString("Napoleon");
                String donut_t2 = documentSnapshot.getString("Donut");
                String arabia_t2 = documentSnapshot.getString("Arabia Coffee");
                String cappuchino_t2 = documentSnapshot.getString("Cappuccino");
                String latte_t2 = documentSnapshot.getString("Latte");
                String caprese_t2 = documentSnapshot.getString("Caprese");
                String caesar_t2 = documentSnapshot.getString("Caesar");
                String vegetable_t2 = documentSnapshot.getString("Vegetable salad");
                String french_t2 = documentSnapshot.getString("French fries");
                String hot_dog_t2 = documentSnapshot.getString("Hot dog");
                String burger_t2 = documentSnapshot.getString("Beef burger");
                String cola_t2 = documentSnapshot.getString("Coca-Cola");
                String fanta_t2 = documentSnapshot.getString("Fanta");
                String sprite_t2 = documentSnapshot.getString("Sprite");
                String water_t2 = documentSnapshot.getString("Water");
                String sum_t2 = documentSnapshot.getString("Total");
                if (Integer.parseInt(meat_t2) != 0){
                    meat_n_t2.setText(R.string.meat);
                    meat_n2_t2.setText(" " + Integer.parseInt(meat_t2)+"---"+Integer.parseInt(meat_t2)*3000+"amd");
                    meat_n_t2.setVisibility(View.VISIBLE);
                    meat_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cheese_t2) != 0){
                    cheese_n_t2.setText(R.string.cheese);
                    cheese_n2_t2.setText(" " + Integer.parseInt(cheese_t2)+"---"+Integer.parseInt(cheese_t2)*2500+"amd");
                    cheese_n_t2.setVisibility(View.VISIBLE);
                    cheese_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(marinade_t2) != 0){
                    marinade_n_t2.setText(R.string.marinade );
                    marinade_n2_t2.setText(" "+ Integer.parseInt(marinade_t2)+"---"+Integer.parseInt(marinade_t2)*1800+"amd");
                    marinade_n_t2.setVisibility(View.VISIBLE);
                    marinade_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(mikado_t2) != 0){
                    mikado_n_t2.setText(R.string.mikado);
                    mikado_n2_t2.setText(" "+ Integer.parseInt(mikado_t2)+"---"+Integer.parseInt(mikado_t2)*550+"amd");
                    mikado_n_t2.setVisibility(View.VISIBLE);
                    mikado_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(napoleon_t2) != 0){
                    napoleon_n_t2.setText(R.string.napoleon);
                    napoleon_n2_t2.setText( " "+ Integer.parseInt(napoleon_t2)+"---"+Integer.parseInt(napoleon_t2)*600+"amd");
                    napoleon_n_t2.setVisibility(View.VISIBLE);
                    napoleon_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(donut_t2) != 0){
                    donut_n_t2.setText(R.string.donut);
                    donut_n2_t2.setText( + Integer.parseInt(donut_t2)+"---"+Integer.parseInt(donut_t2)*750+"amd");
                    donut_n_t2.setVisibility(View.VISIBLE);
                    donut_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(arabia_t2) != 0){
                    arabia_n_t2.setText(R.string.arabia);
                    arabia_n2_t2.setText( " "+ Integer.parseInt(arabia_t2)+"---"+Integer.parseInt(arabia_t2)*700+"amd");
                    arabia_n_t2.setVisibility(View.VISIBLE);
                    arabia_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cappuchino_t2) != 0){
                    cappuchino_n_t2.setText(R.string.cappuchino);
                    cappuchino_n2_t2.setText(" " + Integer.parseInt(cappuchino_t2)+"---"+Integer.parseInt(cappuchino_t2)*750+"amd");
                    cappuchino_n_t2.setVisibility(View.VISIBLE);
                    cappuchino_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(latte_t2) != 0){
                    latte_n_t2.setText(R.string.latte);
                    latte_n2_t2.setText(" " + Integer.parseInt(latte_t2)+"---"+Integer.parseInt(latte_t2)*1000+"amd");
                    latte_n_t2.setVisibility(View.VISIBLE);
                    latte_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caprese_t2) != 0){
                    caprese_n_t2.setText(R.string.caprese);
                    caprese_n2_t2.setText(" " + Integer.parseInt(caprese_t2)+"---"+Integer.parseInt(caprese_t2)*1200+"amd");
                    caprese_n_t2.setVisibility(View.VISIBLE);
                    caprese_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caesar_t2) != 0){
                    caesar_n_t2.setText(R.string.caesar);
                    caesar_n2_t2.setText(" " + Integer.parseInt(caesar_t2)+"---"+Integer.parseInt(caesar_t2)*1000+"amd");
                    caesar_n_t2.setVisibility(View.VISIBLE);
                    caesar_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(vegetable_t2) != 0){
                    vegetable_n_t2.setText(R.string.vegetable);
                    vegetable_n2_t2.setText(" " + Integer.parseInt(vegetable_t2)+"---"+Integer.parseInt(vegetable_t2)*500+"amd");
                    vegetable_n_t2.setVisibility(View.VISIBLE);
                    vegetable_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(french_t2) != 0){
                    french_n_t2.setText(R.string.french_fries);
                    french_n2_t2.setText(" " + Integer.parseInt(french_t2)+"---"+Integer.parseInt(french_t2)*550+"amd");
                    french_n_t2.setVisibility(View.VISIBLE);
                    french_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(hot_dog_t2) != 0){
                    hot_dog_n_t2.setText(R.string.hot_dog);
                    hot_dog_n2_t2.setText(" " + Integer.parseInt(hot_dog_t2)+"---"+Integer.parseInt(hot_dog_t2)*800+"amd");
                    hot_dog_n_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(burger_t2) != 0){
                    burger_n_t2.setText(R.string.burger);
                    burger_n2_t2.setText(" " + Integer.parseInt(burger_t2)+"---"+Integer.parseInt(burger_t2)*1200+"amd");
                    burger_n_t2.setVisibility(View.VISIBLE);
                    burger_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cola_t2) != 0){
                    cola_n_t2.setText(R.string.coca);
                    cola_n2_t2.setText(" "+  Integer.parseInt(cola_t2)+"---"+Integer.parseInt(cola_t2)*500+"amd");
                    cola_n_t2.setVisibility(View.VISIBLE);
                    cola_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(fanta_t2) != 0){
                    fanta_n_t2.setText(R.string.fanta);
                    fanta_n2_t2.setText(" " + Integer.parseInt(fanta_t2)+"---"+Integer.parseInt(fanta_t2)*500+"amd");
                    fanta_n2_t2.setVisibility(View.VISIBLE);
                    fanta_n_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sprite_t2) != 0){
                    sprite_n_t2.setText(R.string.sprite);
                    sprite_n2_t2.setText(" " + Integer.parseInt(sprite_t2)+"---"+Integer.parseInt(sprite_t2)*500+"amd");
                    sprite_n_t2.setVisibility(View.VISIBLE);
                    sprite_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(water_t2) != 0){
                    water_n_t2.setText(R.string.water);
                    water_n2_t2.setText(" " + Integer.parseInt(water_t2)+"---"+Integer.parseInt(water_t2)*300+"amd");
                    water_n_t2.setVisibility(View.VISIBLE);
                    water_n2_t2.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sum_t2) != 0){
                    sum_n_t2.setText(R.string.total);
                    sum_n2_t2.setText(" " + Integer.parseInt(sum_t2) + "amd");
                    sum_n_t2.setVisibility(View.VISIBLE);
                    sum_n2_t2.setVisibility(View.VISIBLE);
                    print_t2.setVisibility(View.VISIBLE);
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Table2.this,"Fail",Toast.LENGTH_SHORT).show();
                Toast.makeText(Table2.this,e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    public void print_2(View view){
        Toast.makeText(Table2.this,R.string.print,Toast.LENGTH_LONG).show();
    }
    public void home_2(View view){
        Intent i = new Intent(Table2.this, MainActivity.class);
        startActivity(i);
    }
}