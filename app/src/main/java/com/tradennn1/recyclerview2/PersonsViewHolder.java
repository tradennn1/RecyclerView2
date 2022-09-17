package com.tradennn1.recyclerview2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonsViewHolder extends RecyclerView.ViewHolder {
    private TextView persons;

    public PersonsViewHolder(@NonNull View itemView) {
        super(itemView);
        persons = itemView.findViewById(R.id.textview);
    }

    public void bind(String textview) {
        persons.setText(textview);
    }
}
