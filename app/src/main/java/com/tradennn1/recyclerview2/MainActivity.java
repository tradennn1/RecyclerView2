package com.tradennn1.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> personsList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);

        personsList.add("Abraham Lincoln");
        personsList.add("John F. Kennedy");
        personsList.add("Queen Elizabeth II");
        personsList.add("Winston Churchill");
        personsList.add("Donald Trump");
        personsList.add("Mark Zuckerberg");
        personsList.add("Bill Gates");
        personsList.add("Steve Jobs");
        personsList.add("Muhammad Ali");
        personsList.add("Christopher Columbus");
        personsList.add("Leonardo da Vinci");
        personsList.add("Franklin D. Roosevelt");
        personsList.add("Walt Disney");
        personsList.add("Henry Ford");
        personsList.add("Oprah Winfrey");
        personsList.add("Albert Einstein");
        personsList.add("Marilyn Monroe");
        personsList.add("Indira Gandhi");
        personsList.add("Barack Obama");
        personsList.add("Pablo Escobar");
        personsList.add("Pablo Picasso");
        personsList.add("Angelina Jolie");
        personsList.add("Michael Jackson");
        personsList.add("Joe Biden");
        personsList.add("Brad Pitt");
        personsList.add("Pele");

        PersonsAdapter adapter = new PersonsAdapter(personsList);
        recyclerView.setAdapter(adapter);
    }
}