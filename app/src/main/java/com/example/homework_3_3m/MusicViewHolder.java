package com.example.homework_3_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MusicViewHolder extends RecyclerView.ViewHolder {
    private TextView musName;
    public MusicViewHolder(@NonNull View itemView) {
        super(itemView);
        musName = itemView.findViewById(R.id.mus_name);
    }
    public void bind(String name) {
        musName.setText(name);
    }
}
