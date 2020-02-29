package com.graha.jelajahapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_PERSON = "extra_person";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView judul = findViewById(R.id.judul);
        TextView keterangan = findViewById(R.id.keterangan);
        ImageView image_act_baru = findViewById(R.id.image_act_baru);

        Mount mount = getIntent().getParcelableExtra(EXTRA_PERSON);

        judul.setText(mount.getName());
        keterangan.setText(mount.getDetail());
        image_act_baru.setImageResource(mount.getPhoto());


    }
}
