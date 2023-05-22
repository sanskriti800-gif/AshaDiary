package com.example.aashadiaries;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HealthFacilities extends AppCompatActivity {

    Button ideal;
    Button ANC1;
    Button ANC2;
    Button ANC4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_facilities);

        ideal = findViewById(R.id.idealANC);
        ANC1 = findViewById(R.id.firstANC);
        ANC2 = findViewById(R.id.secondANC);
        ANC4 = findViewById(R.id.fourthANC);

        ideal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DetailedInformationCentreWithYoutube.class);
                intent.putExtra("YTLink","fpLweclGxlw");
                startActivity(intent);
            }
        });

        ANC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DetailedInformationCentreWithYoutube.class);
                intent.putExtra("YTLink","kx41flZEzPo");
                startActivity(intent);
            }
        });

        ANC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DetailedInformationCentreWithYoutube.class);
                intent.putExtra("YTLink","56CKFiwB9L8");
                startActivity(intent);
            }
        });

        ANC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DetailedInformationCentreWithYoutube.class);
                intent.putExtra("YTLink","WL2ul8ZK3Gg");
                startActivity(intent);
            }
        });

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.info);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(),Info.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}