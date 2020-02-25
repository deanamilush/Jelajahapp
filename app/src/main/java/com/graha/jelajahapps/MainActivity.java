package com.graha.jelajahapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mount_item;
    private ArrayList<Mount> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mount_item = findViewById(R.id.mount_item);
        mount_item.setHasFixedSize(true);

        list.addAll(MountData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        mount_item.setLayoutManager(new LinearLayoutManager(this));
        ListMountAdapter listHeroAdapter = new ListMountAdapter(list);
        mount_item.setAdapter(listHeroAdapter);
    }
}
