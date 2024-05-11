package com.nizarkabul.landmarkbookjava;

import static android.media.CamcorderProfile.get;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.nizarkabul.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {


    ArrayList<Landmark> landmarkArraylist;
    private ActivityMainBinding binding;

    //static Landmark chosenLandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data

        landmarkArraylist= new ArrayList<>();

        Landmark pisa= new Landmark("pisa","italy",R.drawable.pisa);
        Landmark eiffel=new Landmark("eiffel","France",R.drawable.eiffel);
        Landmark colosseum= new Landmark("colosseum","Italy",R.drawable.colosseum);
        Landmark londonbridge= new Landmark("londonbridge","UK",R.drawable.londonbrige);

        landmarkArraylist.add(pisa);
        landmarkArraylist.add(eiffel);
        landmarkArraylist.add(colosseum);
        landmarkArraylist.add(londonbridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter= new LandmarkAdapter(landmarkArraylist);
        binding.recyclerView.setAdapter(landmarkAdapter);


        //Adapter

        //ListView

        //mapping
        /*
        ArrayAdapter ArrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                landmarkArraylist.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(ArrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(MainActivity.this,landmarkArraylist,get(position).,Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity.this,DetailsAktivitiy.class);
                intent.putExtra("landmark",landmarkArraylist.get(position).name);
                startActivity(intent);
            }
        });

         */
    }



}