package com.example.personajirecycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonajiViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPersonaji;
    public PersonajiViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPersonaji = itemView.findViewById(R.id.Personaji);
    }

    public void bind(String Number) {
        tvPersonaji.setText(Number);}
    }
