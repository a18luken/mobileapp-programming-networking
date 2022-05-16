package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterMountain extends RecyclerView.Adapter<MountainViewHolder> {

    private List<Mountain> mountains = new ArrayList<>();

    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MountainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {
        //holder.mountain_name.setText(mountains.get(position));

        Mountain mountain = mountains.get(position);
        holder.name.setText(mountain.getName());
        holder.height.setText(mountain.getHeight());
        holder.height.setText(mountain.getLocation());


    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }
    public void setMountains(List<Mountain> mountains){
        this.mountains = mountains;
    }

}
    /*

    public class AdapterMountainViewHolder extends RecyclerView.ViewHolder {
        private TextView mountain_name;
        public AdapterMountainViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_name = itemView.findViewById(R.id.mountain_names);
        }
    }
}*/
