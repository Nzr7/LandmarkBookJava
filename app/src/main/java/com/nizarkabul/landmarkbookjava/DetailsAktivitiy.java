package com.nizarkabul.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.nizarkabul.landmarkbookjava.databinding.ActivityDetailsAktivitiyBinding;

public class DetailsAktivitiy extends AppCompatActivity {

    private ActivityDetailsAktivitiyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityDetailsAktivitiyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent= getIntent();

        //Costing
        //Landmark selectedLandmark= (Landmark) intent.getSerializableExtra("Landmake");

        //Landmark selectedLandmark=chosenLandmark;


        singleton Singleton=singleton.getInstance();
        Landmark selectedLandmark=Singleton.getSentLandmark();
        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}