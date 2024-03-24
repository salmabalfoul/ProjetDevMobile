package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] villes = getResources().getStringArray(R.array.villes);

        // Créer un ArrayAdapter pour le Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, villes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Référence du Spinner dans le layout
        Spinner spinner = findViewById(R.id.spinner_villes);
        spinner.setAdapter(adapter);

        // Ecouteur de sélection pour le Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity2.this, "Ville sélectionnée : " + selectedCity, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Ne rien faire si aucune ville n'est sélectionnée
            }
        });

        // Button creation and onClickListener
        Button button = findViewById(R.id.creer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create Intent to start MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);

                // Start MainActivity
                startActivity(intent);
            }
        });
    }
}


