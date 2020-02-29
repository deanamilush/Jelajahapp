package com.graha.jelajahapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    private void showSelectedHero(Mount mount) {
        Intent gotodetail = new Intent(MainActivity.this, DetailActivity.class);
        gotodetail.putExtra(DetailActivity.EXTRA_PERSON, mount);
        startActivity(gotodetail);
    }

    private void showRecyclerList() {
        mount_item.setLayoutManager(new LinearLayoutManager(this));
        ListMountAdapter listHeroAdapter = new ListMountAdapter(list);
        mount_item.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListMountAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Mount data) {
                showSelectedHero(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent gotoabout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(gotoabout);
                break;
        }
    }
}