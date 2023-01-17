package com.example.uas_masjid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvTentang, tvAlamat, tvKoordinat;
    private String yNama, yTentang, yFoto, yAlamat, yKoordinat;
    private Button btnBuka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto = findViewById(R.id.iv_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvTentang = findViewById(R.id.tv_tentang);
        tvAlamat = findViewById(R.id.tv_alamat);
        tvKoordinat = findViewById(R.id.tv_koordinat);
        btnBuka = findViewById(R.id.btn_buka);

        Intent terima = getIntent();
        yNama = terima.getStringExtra("xNama");
        yTentang = terima.getStringExtra("xTentang");
        yFoto = terima.getStringExtra("xFoto");
        yAlamat = terima.getStringExtra("xAlamat");
        yKoordinat = terima.getStringExtra("xKoordinat");

        tvNama.setText(yNama);
        tvTentang.setText(yTentang);
        tvAlamat.setText(yAlamat);
        tvKoordinat.setText(yKoordinat);
        Glide.with(DetailActivity.this).load(yFoto).into(ivFoto);

        btnBuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uribukalokasi = Uri.parse("geo:0,0?q=" + yKoordinat);

                Intent bukalokasi = new Intent(Intent.ACTION_VIEW, uribukalokasi);
                startActivity(bukalokasi);
            }
        });
    }
}
