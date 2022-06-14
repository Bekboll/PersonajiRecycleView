package com.example.personajirecycleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonajiAdapter extends RecyclerView.Adapter<PersonajiViewHolder> {
    private ArrayList<String> personaji;

    public PersonajiAdapter(ArrayList<String> personaji) {
        this.personaji = personaji;
    }

    @NonNull
    @Override
    public PersonajiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonajiViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaji,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajiViewHolder holder, int position) {
        holder.bind(personaji.get(position));

    }

    @Override
    public int getItemCount() {
        return personaji.size();
    }
}