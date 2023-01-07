package com.example.uas_masjid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMasjid;
    private ArrayList<ModelMasjid> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMasjid = findViewById(R.id.rv_masjid);
        rvMasjid.setHasFixedSize(true);

        data.addAll(DataMasjid.ambilDataMasjid());
        tampilDataMasjid();
    }

    private void tampilDataMasjid() {
        AdapterMasjid AM = new AdapterMasjid(data, MainActivity.this);

        rvMasjid.setLayoutManager(new LinearLayoutManager(this));
        rvMasjid.setAdapter(AM);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tampilan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_about){
            Intent About = new Intent(MainActivity.this, About.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
