package com.example.uas_masjid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterMasjid extends RecyclerView.Adapter<AdapterMasjid.VHMasjid> {
    private ArrayList<ModelMasjid> dataMasjid  ;
    private Context ctx;

    public AdapterMasjid(ArrayList<ModelMasjid> dataMasjid, Context ctx){
        this.dataMasjid = dataMasjid;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public VHMasjid onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new VHMasjid(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull VHMasjid holder, int position) {
        ModelMasjid Masjid = dataMasjid.get(position);

        holder.tvNama.setText(Masjid.getNama());
        holder.tvTentang.setText(Masjid.getTentang());
        holder.tvAlamat.setText(Masjid.getAlamat());
        holder.tvKoordinat.setText(Masjid.getKoordinat());


        Glide
                .with(ctx)
                .load(Masjid.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNama, xTentang, xFoto, xAlamat, xKoordinat;

                xNama = Masjid.getNama();
                xTentang = Masjid.getTentang();
                xFoto = Masjid.getFoto();
                xAlamat = Masjid.getAlamat();
                xKoordinat = Masjid.getKoordinat();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xFoto", xFoto);
                kirim.putExtra("xTentang", xTentang);
                kirim.putExtra("xAlamat", xAlamat);
                kirim.putExtra("xKoordinat", xKoordinat);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {return dataMasjid.size();}

    public class VHMasjid extends RecyclerView.ViewHolder {
        TextView tvNama, tvTentang, tvAlamat, tvKoordinat;
        ImageView ivFoto;

        public VHMasjid(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
            tvKoordinat = itemView.findViewById(R.id.tv_koordinat);
        }
    }
}
