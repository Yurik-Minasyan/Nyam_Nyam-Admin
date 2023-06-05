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

public class Table4 extends AppCompatActivity {
    private DatabaseReference mDatabase;
    FirebaseFirestore Firestore;
    TextView meat_n_t4;
    TextView cheese_n_t4;
    TextView marinade_n_t4;
    TextView mikado_n_t4;
    TextView napoleon_n_t4;
    TextView donut_n_t4;
    TextView arabia_n_t4;
    TextView cappuchino_n_t4;
    TextView latte_n_t4;
    TextView caprese_n_t4;
    TextView caesar_n_t4;
    TextView vegetable_n_t4;
    TextView french_n_t4;
    TextView hot_dog_n_t4;
    TextView burger_n_t4;
    TextView cola_n_t4;
    TextView fanta_n_t4;
    TextView sprite_n_t4;
    TextView water_n_t4;
    TextView sum_n_t4;
    TextView meat_n2_t4;
    TextView cheese_n2_t4;
    TextView marinade_n2_t4;
    TextView mikado_n2_t4;
    TextView napoleon_n2_t4;
    TextView donut_n2_t4;
    TextView arabia_n2_t4;
    TextView cappuchino_n2_t4;
    TextView latte_n2_t4;
    TextView caprese_n2_t4;
    TextView caesar_n2_t4;
    TextView vegetable_n2_t4;
    TextView french_n2_t4;
    TextView hot_dog_n2_t4;
    TextView burger_n2_t4;
    TextView cola_n2_t4;
    TextView fanta_n2_t4;
    TextView sprite_n2_t4;
    TextView water_n2_t4;
    TextView sum_n2_t4;
    ImageView print_t4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table4);
        meat_n_t4 = findViewById(R.id.meat_tt_t4);
        print_t4 = findViewById(R.id.print_t4);
        cheese_n_t4 = findViewById(R.id.chesse_tt_t4);
        marinade_n_t4 = findViewById(R.id.marinade_tt_t4);
        mikado_n_t4 = findViewById(R.id.mikado_tt_t4);
        napoleon_n_t4 = findViewById(R.id.napleon_tt_t4);
        donut_n_t4 = findViewById(R.id.donut_tt_t4);
        arabia_n_t4 = findViewById(R.id.arabia_tt_t4);
        cappuchino_n_t4 = findViewById(R.id.cappuchino_tt_t4);
        latte_n_t4 = findViewById(R.id.latte_tt_t4);
        caprese_n_t4 = findViewById(R.id.caprese_tt_t4);
        caesar_n_t4 = findViewById(R.id.caesar_tt_t4);
        vegetable_n_t4 = findViewById(R.id.vegetable_tt_t4);
        french_n_t4 = findViewById(R.id.french_tt_t4);
        hot_dog_n_t4 = findViewById(R.id.hot_dog_tt_t4);
        burger_n_t4 = findViewById(R.id.burger_tt_t4);
        cola_n_t4 = findViewById(R.id.cola_tt_t4);
        fanta_n_t4= findViewById(R.id.fanta_tt_t4);
        sprite_n_t4 = findViewById(R.id.sprite_tt_t4);
        water_n_t4 = findViewById(R.id.water_tt_t4);
        sum_n_t4 = findViewById(R.id.sum_tt_t4);
        meat_n2_t4 = findViewById(R.id.meat_tt2_t4);
        cheese_n2_t4 = findViewById(R.id.chesse_tt2_t4);
        marinade_n2_t4 = findViewById(R.id.marinade_tt2_t4);
        mikado_n2_t4= findViewById(R.id.mikado_tt2_t4);
        napoleon_n2_t4 = findViewById(R.id.napleon_tt2_t4);
        donut_n2_t4 = findViewById(R.id.donut_tt2_t4);
        arabia_n2_t4 = findViewById(R.id.arabia_tt2_t4);
        cappuchino_n2_t4 = findViewById(R.id.cappuchino_tt2_t4);
        latte_n2_t4 = findViewById(R.id.latte_tt2_t4);
        caprese_n2_t4 = findViewById(R.id.caprese_tt2_t4);
        caesar_n2_t4 = findViewById(R.id.caesar_tt2_t4);
        vegetable_n2_t4 = findViewById(R.id.vegetable_tt2_t4);
        french_n2_t4 = findViewById(R.id.french_tt2_t4);
        hot_dog_n2_t4 = findViewById(R.id.hot_dog_tt2_t4);
        burger_n2_t4 = findViewById(R.id.burger_tt2_t4);
        cola_n2_t4 = findViewById(R.id.cola_tt2_t4);
        fanta_n2_t4 = findViewById(R.id.fanta_tt2_t4);
        sprite_n2_t4 = findViewById(R.id.sprite_tt2_t4);
        water_n2_t4 = findViewById(R.id.water_tt2_t4);
        sum_n2_t4 = findViewById(R.id.sum_tt2_t4);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Firestore = FirebaseFirestore.getInstance();
        Firestore.collection("Order").document("Table4").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String meat_t4 = documentSnapshot.getString("Meat Snack");
                String cheese_t4 = documentSnapshot.getString("Cheese");
                String marinade_t4 = documentSnapshot.getString("Marinade");
                String mikado_t4 = documentSnapshot.getString("Mikado");
                String napoleon_t4 = documentSnapshot.getString("Napoleon");
                String donut_t4 = documentSnapshot.getString("Donut");
                String arabia_t4 = documentSnapshot.getString("Arabia Coffee");
                String cappuchino_t4 = documentSnapshot.getString("Cappuccino");
                String latte_t4 = documentSnapshot.getString("Latte");
                String caprese_t4 = documentSnapshot.getString("Caprese");
                String caesar_t4 = documentSnapshot.getString("Caesar");
                String vegetable_t4 = documentSnapshot.getString("Vegetable salad");
                String french_t4 = documentSnapshot.getString("French fries");
                String hot_dog_t4 = documentSnapshot.getString("Hot dog");
                String burger_t4 = documentSnapshot.getString("Beef burger");
                String cola_t4 = documentSnapshot.getString("Coca-Cola");
                String fanta_t4 = documentSnapshot.getString("Fanta");
                String sprite_t4 = documentSnapshot.getString("Sprite");
                String water_t4 = documentSnapshot.getString("Water");
                String sum_t4 = documentSnapshot.getString("Total");
                if (Integer.parseInt(meat_t4) != 0){
                    meat_n_t4.setText(R.string.meat);
                    meat_n2_t4.setText(" " + Integer.parseInt(meat_t4)+"---"+Integer.parseInt(meat_t4)*3000+"amd");
                    meat_n_t4.setVisibility(View.VISIBLE);
                    meat_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cheese_t4) != 0){
                    cheese_n_t4.setText(R.string.cheese);
                    cheese_n2_t4.setText(" " + Integer.parseInt(cheese_t4)+"---"+Integer.parseInt(cheese_t4)*2500+"amd");
                    cheese_n_t4.setVisibility(View.VISIBLE);
                    cheese_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(marinade_t4) != 0){
                    marinade_n_t4.setText(R.string.marinade );
                    marinade_n2_t4.setText(" "+ Integer.parseInt(marinade_t4)+"---"+Integer.parseInt(marinade_t4)*1800+"amd");
                    marinade_n_t4.setVisibility(View.VISIBLE);
                    marinade_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(mikado_t4) != 0){
                    mikado_n_t4.setText(R.string.mikado);
                    mikado_n2_t4.setText(" "+ Integer.parseInt(mikado_t4)+"---"+Integer.parseInt(mikado_t4)*550+"amd");
                    mikado_n_t4.setVisibility(View.VISIBLE);
                    mikado_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(napoleon_t4) != 0){
                    napoleon_n_t4.setText(R.string.napoleon);
                    napoleon_n2_t4.setText( " "+ Integer.parseInt(napoleon_t4)+"---"+Integer.parseInt(napoleon_t4)*600+"amd");
                    napoleon_n_t4.setVisibility(View.VISIBLE);
                    napoleon_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(donut_t4) != 0){
                    donut_n_t4.setText(R.string.donut);
                    donut_n2_t4.setText( + Integer.parseInt(donut_t4)+"---"+Integer.parseInt(donut_t4)*750+"amd");
                    donut_n_t4.setVisibility(View.VISIBLE);
                    donut_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(arabia_t4) != 0){
                    arabia_n_t4.setText(R.string.arabia);
                    arabia_n2_t4.setText( " "+ Integer.parseInt(arabia_t4)+"---"+Integer.parseInt(arabia_t4)*700+"amd");
                    arabia_n_t4.setVisibility(View.VISIBLE);
                    arabia_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cappuchino_t4) != 0){
                    cappuchino_n_t4.setText(R.string.cappuchino);
                    cappuchino_n2_t4.setText(" " + Integer.parseInt(cappuchino_t4)+"---"+Integer.parseInt(cappuchino_t4)*750+"amd");
                    cappuchino_n_t4.setVisibility(View.VISIBLE);
                    cappuchino_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(latte_t4) != 0){
                    latte_n_t4.setText(R.string.latte);
                    latte_n2_t4.setText(" " + Integer.parseInt(latte_t4)+"---"+Integer.parseInt(latte_t4)*1000+"amd");
                    latte_n_t4.setVisibility(View.VISIBLE);
                    latte_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caprese_t4) != 0){
                    caprese_n_t4.setText(R.string.caprese);
                    caprese_n2_t4.setText(" " + Integer.parseInt(caprese_t4)+"---"+Integer.parseInt(caprese_t4)*1200+"amd");
                    caprese_n_t4.setVisibility(View.VISIBLE);
                    caprese_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(caesar_t4) != 0){
                    caesar_n_t4.setText(R.string.caesar);
                    caesar_n2_t4.setText(" " + Integer.parseInt(caesar_t4)+"---"+Integer.parseInt(caesar_t4)*1000+"amd");
                    caesar_n_t4.setVisibility(View.VISIBLE);
                    caesar_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(vegetable_t4) != 0){
                    vegetable_n_t4.setText(R.string.vegetable);
                    vegetable_n2_t4.setText(" " + Integer.parseInt(vegetable_t4)+"---"+Integer.parseInt(vegetable_t4)*500+"amd");
                    vegetable_n_t4.setVisibility(View.VISIBLE);
                    vegetable_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(french_t4) != 0){
                    french_n_t4.setText(R.string.french_fries);
                    french_n2_t4.setText(" " + Integer.parseInt(french_t4)+"---"+Integer.parseInt(french_t4)*550+"amd");
                    french_n_t4.setVisibility(View.VISIBLE);
                    french_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(hot_dog_t4) != 0){
                    hot_dog_n_t4.setText(R.string.hot_dog);
                    hot_dog_n2_t4.setText(" " + Integer.parseInt(hot_dog_t4)+"---"+Integer.parseInt(hot_dog_t4)*800+"amd");
                    hot_dog_n_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(burger_t4) != 0){
                    burger_n_t4.setText(R.string.burger);
                    burger_n2_t4.setText(" " + Integer.parseInt(burger_t4)+"---"+Integer.parseInt(burger_t4)*1200+"amd");
                    burger_n_t4.setVisibility(View.VISIBLE);
                    burger_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(cola_t4) != 0){
                    cola_n_t4.setText(R.string.coca);
                    cola_n2_t4.setText(" "+  Integer.parseInt(cola_t4)+"---"+Integer.parseInt(cola_t4)*500+"amd");
                    cola_n_t4.setVisibility(View.VISIBLE);
                    cola_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(fanta_t4) != 0){
                    fanta_n_t4.setText(R.string.fanta);
                    fanta_n2_t4.setText(" " + Integer.parseInt(fanta_t4)+"---"+Integer.parseInt(fanta_t4)*500+"amd");
                    fanta_n2_t4.setVisibility(View.VISIBLE);
                    fanta_n_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sprite_t4) != 0){
                    sprite_n_t4.setText(R.string.sprite);
                    sprite_n2_t4.setText(" " + Integer.parseInt(sprite_t4)+"---"+Integer.parseInt(sprite_t4)*500+"amd");
                    sprite_n_t4.setVisibility(View.VISIBLE);
                    sprite_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(water_t4) != 0){
                    water_n_t4.setText(R.string.water);
                    water_n2_t4.setText(" " + Integer.parseInt(water_t4)+"---"+Integer.parseInt(water_t4)*300+"amd");
                    water_n_t4.setVisibility(View.VISIBLE);
                    water_n2_t4.setVisibility(View.VISIBLE);
                }
                if (Integer.parseInt(sum_t4) != 0){
                    sum_n_t4.setText(R.string.total);
                    sum_n2_t4.setText(" " + Integer.parseInt(sum_t4) + "amd");
                    sum_n_t4.setVisibility(View.VISIBLE);
                    sum_n2_t4.setVisibility(View.VISIBLE);
                    print_t4.setVisibility(View.VISIBLE);
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Table4.this,"Fail",Toast.LENGTH_SHORT).show();
                Toast.makeText(Table4.this,e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    public void print_4(View view){
        Toast.makeText(Table4.this,R.string.print,Toast.LENGTH_LONG).show();
    }
    public void home_4(View view){
        Intent i = new Intent(Table4.this, MainActivity.class);
        startActivity(i);
    }
}