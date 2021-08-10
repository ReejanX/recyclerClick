package com.example.whatsapp;

import static com.example.whatsapp.R.layout.activity_details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    Model model;
    TextView nameTV ;
    TextView areaTV ;
    TextView religionTV ;
    TextView populationTV ;
    TextView wikiTV ;
    TextView animalsTV;
    TextView birdsTV ;
    Button backBtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_details);
        Bundle bundle = getIntent().getExtras();
        model = bundle.getParcelable("Model");
        String Name= model.getTitle();
        setTitle(Name);
        String Area = model.getArea();
        String religion= model.getReligions();
        String population = model.getPopulation();
        String wikiData = model.getWikiData();
        String animals = model.getAnimals();
        String birds = model.getBirds();
        int icon = model.getIcon();

        nameTV = findViewById(R.id.countryName);
        areaTV = findViewById(R.id.countryArea);
        religionTV = findViewById(R.id.countryReligion);
        populationTV = findViewById(R.id.countryPopulation);
        wikiTV = findViewById(R.id.wikiDetails);
        animalsTV = findViewById(R.id.animalsFound);
        birdsTV = findViewById(R.id.birdsFound);
        backBtn= findViewById(R.id.back);

        nameTV.setText("Country Name: "+Name);
        areaTV.setText("Area: "+Area);
        religionTV.setText("Religions :"+religion);
        populationTV.setText("Population: "+population);
        wikiTV.setText(wikiData);
        animalsTV.setText("Animals found: "+animals);
        birdsTV.setText("Birds found: "+birds);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}