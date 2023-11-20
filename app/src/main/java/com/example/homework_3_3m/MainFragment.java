package com.example.homework_3_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvMusic;
    ArrayList<String> musicList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        MusicAdapter adapter = new MusicAdapter(musicList);
        rvMusic.setAdapter(adapter);
    }

    private void loadData() {
        musicList.add("Your Right");
        musicList.add("Shape of You");
        musicList.add("All about you");
        musicList.add("Sway");
        musicList.add("La la life");
        musicList.add("Too Good At Goodbyes");
        musicList.add("I Need You Most Of All");
        musicList.add("Dark Horse");
        musicList.add("Once again");
        musicList.add("Deja vu");
        musicList.add("Smack That");
        musicList.add("After hours");
        musicList.add("Mirrors");
        musicList.add("Cry me a river");
    }

    private void initView() {
        rvMusic = requireActivity().findViewById(R.id.rv_music);
    }
}