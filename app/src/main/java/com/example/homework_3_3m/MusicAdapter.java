package com.example.homework_3_3m;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {

    private ArrayList<String> musicList;

    public MusicAdapter(ArrayList<String> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(musicList.get(position));

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
}