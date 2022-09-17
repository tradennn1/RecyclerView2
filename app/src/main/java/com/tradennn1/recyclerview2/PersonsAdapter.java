package com.tradennn1.recyclerview2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonsAdapter extends RecyclerView.Adapter<PersonsViewHolder> {
    private ArrayList<String> personsList;

    public PersonsAdapter(ArrayList<String> personsList) {
        this.personsList = personsList;
    }

    @NonNull
    @Override
    public PersonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persons, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonsViewHolder holder, int position) {
        holder.bind(personsList.get(position));
    }

    @Override
    public int getItemCount() {
        return personsList.size();
    }
}
