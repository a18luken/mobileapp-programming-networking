package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MountainViewHolder extends RecyclerView.ViewHolder {
    
    private TextView name;
    private TextView location;
    private TextView height;

    public MountainViewHolder(@NonNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.mountain_names);
    }
}
