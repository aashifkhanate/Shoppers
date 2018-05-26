package com.example.android.shoppers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    Button clothes,wardrobe,furniture,kitchen,electronics,food;
    EditText welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        clothes=(Button)findViewById(R.id.Clothes);
        wardrobe=(Button)findViewById(R.id.Wardrobe);
        furniture=(Button)findViewById(R.id.Furniture);
        kitchen=(Button)findViewById(R.id.Kitchen);
        electronics=(Button)findViewById(R.id.Electronics);
        food=(Button)findViewById(R.id.Food);

        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Home.this,Clothes.class);
                startActivity(intent);
            }
        });
        wardrobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(Home.this,Wardrobe.class);
                startActivity(next);
            }
        });
        furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(Home.this,Furniture.class);
                startActivity(next2);
            }
        });
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next3 = new Intent(Home.this,Kitchen.class);
                startActivity(next3);
            }
        });
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next4 = new Intent(Home.this,Electronics.class);
                startActivity(next4);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next5 = new Intent(Home.this,Food.class);
                startActivity(next5);
            }
        });
    }
}
