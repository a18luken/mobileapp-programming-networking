package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMountain extends RecyclerView.Adapter<AdapterMountain.AdapterMountainViewHolder>{
    private List<String> mountains;

    public AdapterMountain(List<String> mountains) {
        this.mountains = mountains;
    }


    @NonNull
    @Override
    public AdapterMountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new AdapterMountainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMountainViewHolder holder, int position) {
        holder.mountain_name.setText(mountains.get(position));
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class AdapterMountainViewHolder extends RecyclerView.ViewHolder {
        private TextView mountain_name;
        public AdapterMountainViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_name = itemView.findViewById(R.id.mountain_names);
        }
    }
}
