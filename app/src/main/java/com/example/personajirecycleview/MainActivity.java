package com.example.personajirecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> Personaji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        PersonajiAdapter adapter = new PersonajiAdapter(Personaji);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        Personaji = new ArrayList<>();
        Personaji.add("Personaj_1");
        Personaji.add("Personaj_2");
        Personaji.add("Personaj_3");
        Personaji.add("Personaj_4");
        Personaji.add("Personaj_5");
        Personaji.add("Personaj_6");
        Personaji.add("Personaj_7");
        Personaji.add("Personaj_8");
        Personaji.add("Personaj_9");
        Personaji.add("Personaj_10");
    }
}