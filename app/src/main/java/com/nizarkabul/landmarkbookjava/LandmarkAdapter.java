package com.nizarkabul.landmarkbookjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nizarkabul.landmarkbookjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>{

    ArrayList<Landmark> landmarkArrayList;

    public LandmarkAdapter(ArrayList<Landmark>landmarkArraList){
        this.landmarkArrayList=landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerRowBinding recyclerrowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerrowBinding);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull LandmarkAdapter.LandmarkHolder holder, int position) {
        holder.binding.recycleViewTextView.setText(landmarkArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(holder.itemView.getContext(),DetailsAktivitiy.class);
               // chosenLandmark=landmarkArrayList.get(position);
                //intent.putExtra("landamark",landmarkArrayList.get(position));
                singleton Singleton=singleton.getInstance();

                Singleton.setSentLandmark(landmarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;
        public LandmarkHolder(RecyclerRowBinding binding){
            super(binding.getRoot());
            this.binding=binding;
        }

        public LandmarkHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
