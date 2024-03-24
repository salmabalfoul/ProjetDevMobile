package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Référence du Spinner dans le layout
        Spinner categorySpinner = findViewById(R.id.categorySpinner);

        // Récupérer les catégories depuis les ressources
        String[] categories = getResources().getStringArray(R.array.categories);

        // Créer un ArrayAdapter pour le Spinner
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Appliquer l'adaptateur au Spinner
        categorySpinner.setAdapter(categoryAdapter);

        // Référence du Spinner dans le layout
        Spinner sectorSpinner = findViewById(R.id.sectorSpinner);

        // Récupérer les secteurs depuis les ressources
        String[] sectors = getResources().getStringArray(R.array.sectors);

        // Créer un ArrayAdapter pour le Spinner
        ArrayAdapter<String> sectorAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sectors);
        sectorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Appliquer l'adaptateur au Spinner
        sectorSpinner.setAdapter(sectorAdapter);

        // Référence du Spinner dans le layout
        Spinner spinner = findViewById(R.id.spinner_villes);

        // Récupérer les villes depuis les ressources
        String[] villes = getResources().getStringArray(R.array.villes);

        // Créer un ArrayAdapter pour le Spinner
        ArrayAdapter<String> villeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, villes);
        villeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Appliquer l'adaptateur au Spinner
        spinner.setAdapter(villeAdapter);

        // Ecouteur de sélection pour le Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity3.this, "Ville sélectionnée : " + selectedCity, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Ne rien faire si aucune ville n'est sélectionnée
            }
        });

        Button button = findViewById(R.id.suivant);

        // Set OnClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create Intent to start MainActivity4
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);

                // Start MainActivity4
                startActivity(intent);
            }
        });
    }
}




