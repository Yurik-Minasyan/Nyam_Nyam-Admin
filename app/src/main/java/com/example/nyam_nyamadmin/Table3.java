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

public class Table3 extends AppCompatActivity {
    private DatabaseReference mDatabase;
    FirebaseFirestore Firestore;
    TextView meat_n_t3;
    TextView cheese_n_t3;
    TextView marinade_n_t3;
    TextView mikado_n_t3;
    TextView napoleon_n_t3;
    TextView donut_n_t3;
    TextView arabia_n_t3;
    TextView cappuchino_n_t3;
    TextView latte_n_t3;
    TextView caprese_n_t3;
    TextView caesar_n_t3;
    TextView vegetable_n_t3;
    TextView french_n_t3;
    TextView hot_dog_n_t3;
    TextView burger_n_t3;
    TextView cola_n_t3;
    TextView fanta_n_t3;
    TextView sprite_n_t3;
    TextView water_n_t3;
    TextView sum_n_t3;
    TextView meat_n2_t3;
    TextView cheese_n2_t3;
    TextView marinade_n2_t3;
    TextView mikado_n2_t3;
    TextView napoleon_n2_t3;
    TextView donut_n2_t3;
    TextView arabia_n2_t3;
    TextView cappuchino_n2_t3;
    TextView latte_n2_t3;
    TextView caprese_n2_t3;
    TextView caesar_n2_t3;
    TextView vegetable_n2_t3;
    TextView french_n2_t3;
    TextView hot_dog_n2_t3;
    TextView burger_n2_t3;
    TextView cola_n2_t3;
    TextView fanta_n2_t3;
    TextView sprite_n2_t3;
    TextView water_n2_t3;
    TextView sum_n2_t3;
    ImageView print_t3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table3);
        meat_n_t3 = findViewById(R.id.meat_tt_t3);
        print_t3 = findViewById(R.id.print_t3);
        cheese_n_t3 = findViewById(R.id.chesse_tt_t3);
        marinade_n_t3 = findViewById(R.id.marinade_tt_t3);
        mikado_n_t3= findViewById(R.id.mikado_tt_t3);
        napoleon_n_t3 = findViewById(R.id.napleon_tt_t3);
        donut_n_t3 = findViewById(R.id.donut_tt_t3);
        arabia_n_t3 = findViewById(R.id.arabia_tt_t3);
        cappuchino_n_t3 = findViewById(R.id.cappuchino_tt_t3);
        latte_n_t3 = findViewById(R.id.latte_tt_t3);
        caprese_n_t3 = findViewById(R.id.caprese_tt_t3);
        caesar_n_t3 = findViewById(R.id.caesar_tt_t3);
        vegetable_n_t3 = findViewById(R.id.vegetable_tt_t3);
        french_n_t3 = findViewById(R.id.french_tt_t3);
        hot_dog_n_t3 = findViewById(R.id.hot_dog_tt_t3);
        burger_n_t3 = findViewById(R.id.burger_tt_t3);
        cola_n_t3 = findViewById(R.id.cola_tt_t3);
        fanta_n_t3= findViewById(R.id.fanta_tt_t3);
        sprite_n_t3 = findViewById(R.id.sprite_tt_t3);
        water_n_t3 = findViewById(R.id.water_tt_t3);
        sum_n_t3 = findViewById(R.id.sum_tt_t3);
        meat_n2_t3 = findViewById(R.id.meat_tt2_t3);
        cheese_n2_t3 = findViewById(R.id.chesse_tt2_t3);
        marinade_n2_t3 = findViewById(R.id.marinade_tt2_t3);
        mikado_n2_t3 = findViewById(R.id.mikado_tt2_t3);
        napoleon_n2_t3 = findViewById(R.id.napleon_tt2_t3);
        donut_n2_t3 = findViewById(R.id.donut_tt2_t3);
        arabia_n2_t3 = findViewById(R.id.arabia_tt2_t3);
        cappuchino_n2_t3 = findViewById(R.id.cappuchino_tt2_t3);
        latte_n2_t3 = findViewById(R.id.latte_tt2_t3);
        caprese_n2_t3 = findViewById(R.id.caprese_tt2_t3);
        caesar_n2_t3 = findViewById(R.id.caesar_tt2_t3);
        vegetable_n2_t3 = findViewById(R.id.vegetable_tt2_t3);
        french_n2_t3 = findViewById(R.id.french_tt2_t3);
        hot_dog_n2_t3 = findViewById(R.id.hot_dog_tt2_t3);
        burger_n2_t3 = findViewById(R.id.burger_tt2_t3);
        cola_n2_t3 = findViewById(R.id.cola_tt2_t3);
        fanta_n2_t3 = findViewById(R.id.fanta_tt2_t3);
        sprite_n2_t3 = findViewById(R.id.sprite_tt2_t3);
        water_n2_t3 = findViewById(R.id.water_tt2_t3);
        sum_n2_t3 = findViewById(R.id.sum_tt2_t3);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Firestore = FirebaseFirestore.getInstance();
        Firestore.collection("Order").document("Table3").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String meat_t3 = documentSnapshot.getString("Meat Snack");
                String cheese_t3 = documentSnapshot.getString("Cheese");
                String marinade_t3 = documentSnapshot.getString("Marinade");
                String mikado_t3 = documentSnapshot.getString("Mikado");
                String napoleon_t3 = documentSnapshot.getString("Napoleon");
                String donut_t3 = documentSnapshot.getString("Donut");
                String arabia_t3 = documentSnapshot.getString("Arabia Coffee");
                String cappuchino_t3 = documentSnapshot.getString("Cappuccino");
                String latte_t3 = documentSnapshot.getString("Latte");
                String caprese_t3 = documentSnapshot.getString("Caprese");
                String caesar_t3 = documentSnapshot.getString("Caesar");
                String vegetable_t3 = documentSnapshot.getString("Vegetable salad");
                String french_t3 = documentSnapshot.getString("French fries");
                String hot_dog_t3 = documentSnapshot.getString("Hot dog");
                String burger_t3 = documentSnapshot.getString("Beef burger");
                String cola_t3 = documentSnapshot.getString("Coca-Cola");
                String fanta_t3 = documentSnapshot.getString("Fanta");
                String sprite_t3 = documentSnapshot.getString("Sprite");
                String water_t3 = documentSnapshot.getString("Water");
                String sum_t3 = documentSnapshot.getString("Total");
                if (Integer.parseInt(meat_t3) != 0){
                    meat_n_t3.setText(R.string.meat);
                    meat_n2_t3.setText(" " + Integer.parseInt(meat_t3)+"---"+Integer.parseInt(meat_t3)*3000+"amd");
                    meat_n_t3.setVisibility(View.VISIBLE);
                    meat_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cheese_t3) != 0){
                    cheese_n_t3.setText(R.string.cheese);
                    cheese_n2_t3.setText(" " + Integer.parseInt(cheese_t3)+"---"+Integer.parseInt(cheese_t3)*2500+"amd");
                    cheese_n_t3.setVisibility(View.VISIBLE);
                    cheese_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(marinade_t3) != 0){
                    marinade_n_t3.setText(R.string.marinade );
                    marinade_n2_t3.setText(" "+ Integer.parseInt(marinade_t3)+"---"+Integer.parseInt(marinade_t3)*1800+"amd");
                    marinade_n_t3.setVisibility(View.VISIBLE);
                    marinade_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(mikado_t3) != 0){
                    mikado_n_t3.setText(R.string.mikado);
                    mikado_n2_t3.setText(" "+ Integer.parseInt(mikado_t3)+"---"+Integer.parseInt(mikado_t3)*550+"amd");
                    mikado_n_t3.setVisibility(View.VISIBLE);
                    mikado_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(napoleon_t3) != 0){
                    napoleon_n_t3.setText(R.string.napoleon);
                    napoleon_n2_t3.setText( " "+ Integer.parseInt(napoleon_t3)+"---"+Integer.parseInt(napoleon_t3)*600+"amd");
                    napoleon_n_t3.setVisibility(View.VISIBLE);
                    napoleon_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(donut_t3) != 0){
                    donut_n_t3.setText(R.string.donut);
                    donut_n2_t3.setText( + Integer.parseInt(donut_t3)+"---"+Integer.parseInt(donut_t3)*750+"amd");
                    donut_n_t3.setVisibility(View.VISIBLE);
                    donut_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(arabia_t3) != 0){
                    arabia_n_t3.setText(R.string.arabia);
                    arabia_n2_t3.setText( " "+ Integer.parseInt(arabia_t3)+"---"+Integer.parseInt(arabia_t3)*700+"amd");
                    arabia_n_t3.setVisibility(View.VISIBLE);
                    arabia_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cappuchino_t3) != 0){
                    cappuchino_n_t3.setText(R.string.cappuchino);
                    cappuchino_n2_t3.setText(" " + Integer.parseInt(cappuchino_t3)+"---"+Integer.parseInt(cappuchino_t3)*750+"amd");
                    cappuchino_n_t3.setVisibility(View.VISIBLE);
                    cappuchino_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(latte_t3) != 0){
                    latte_n_t3.setText(R.string.latte);
                    latte_n2_t3.setText(" " + Integer.parseInt(latte_t3)+"---"+Integer.parseInt(latte_t3)*1000+"amd");
                    latte_n_t3.setVisibility(View.VISIBLE);
                    latte_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caprese_t3) != 0){
                    caprese_n_t3.setText(R.string.caprese);
                    caprese_n2_t3.setText(" " + Integer.parseInt(caprese_t3)+"---"+Integer.parseInt(caprese_t3)*1200+"amd");
                    caprese_n_t3.setVisibility(View.VISIBLE);
                    caprese_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caesar_t3) != 0){
                    caesar_n_t3.setText(R.string.caesar);
                    caesar_n2_t3.setText(" " + Integer.parseInt(caesar_t3)+"---"+Integer.parseInt(caesar_t3)*1000+"amd");
                    caesar_n_t3.setVisibility(View.VISIBLE);
                    caesar_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(vegetable_t3) != 0){
                    vegetable_n_t3.setText(R.string.vegetable);
                    vegetable_n2_t3.setText(" " + Integer.parseInt(vegetable_t3)+"---"+Integer.parseInt(vegetable_t3)*500+"amd");
                    vegetable_n_t3.setVisibility(View.VISIBLE);
                    vegetable_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(french_t3) != 0){
                    french_n_t3.setText(R.string.french_fries);
                    french_n2_t3.setText(" " + Integer.parseInt(french_t3)+"---"+Integer.parseInt(french_t3)*550+"amd");
                    french_n_t3.setVisibility(View.VISIBLE);
                    french_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(hot_dog_t3) != 0){
                    hot_dog_n_t3.setText(R.string.hot_dog);
                    hot_dog_n2_t3.setText(" " + Integer.parseInt(hot_dog_t3)+"---"+Integer.parseInt(hot_dog_t3)*800+"amd");
                    hot_dog_n_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(burger_t3) != 0){
                    burger_n_t3.setText(R.string.burger);
                    burger_n2_t3.setText(" " + Integer.parseInt(burger_t3)+"---"+Integer.parseInt(burger_t3)*1200+"amd");
                    burger_n_t3.setVisibility(View.VISIBLE);
                    burger_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cola_t3) != 0){
                    cola_n_t3.setText(R.string.coca);
                    cola_n2_t3.setText(" "+  Integer.parseInt(cola_t3)+"---"+Integer.parseInt(cola_t3)*500+"amd");
                    cola_n_t3.setVisibility(View.VISIBLE);
                    cola_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(fanta_t3) != 0){
                    fanta_n_t3.setText(R.string.fanta);
                    fanta_n2_t3.setText(" " + Integer.parseInt(fanta_t3)+"---"+Integer.parseInt(fanta_t3)*500+"amd");
                    fanta_n2_t3.setVisibility(View.VISIBLE);
                    fanta_n_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sprite_t3) != 0){
                    sprite_n_t3.setText(R.string.sprite);
                    sprite_n2_t3.setText(" " + Integer.parseInt(sprite_t3)+"---"+Integer.parseInt(sprite_t3)*500+"amd");
                    sprite_n_t3.setVisibility(View.VISIBLE);
                    sprite_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(water_t3) != 0){
                    water_n_t3.setText(R.string.water);
                    water_n2_t3.setText(" " + Integer.parseInt(water_t3)+"---"+Integer.parseInt(water_t3)*300+"amd");
                    water_n_t3.setVisibility(View.VISIBLE);
                    water_n2_t3.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sum_t3) != 0){
                    sum_n_t3.setText(R.string.total);
                    sum_n2_t3.setText(" " + Integer.parseInt(sum_t3) + "amd");
                    sum_n_t3.setVisibility(View.VISIBLE);
                    sum_n2_t3.setVisibility(View.VISIBLE);
                    print_t3.setVisibility(View.VISIBLE);
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Table3.this,"Fail",Toast.LENGTH_SHORT).show();
                Toast.makeText(Table3.this,e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    public void print_3(View view){
        Toast.makeText(Table3.this,R.string.print,Toast.LENGTH_LONG).show();
    }
    public void home_3(View view){
        Intent i = new Intent(Table3.this, MainActivity.class);
        startActivity(i);
    }
}