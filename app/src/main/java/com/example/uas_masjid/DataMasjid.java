package com.example.uas_masjid;

import android.view.Display;

public class DataMasjid{
    public static String[][] data = new String[][]{
            {"Masjid Agung Palembang","jl. Jend. Sudirman, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30111\n"+
                    "Masjid Agung Palembang (Indonesia Masjid Agung Palembang), juga dikenal sebagai Masjid Agung Sultan Mahmud Badaruddin I setelah mantan Sultan Palembang, adalah masjid utama Palembang, ibukota Sumatera Selatan. Masjid ini merupakan masjid terbesar di Sumatera Selatan, dan masjid terbesar ketiga di Sumatera setelah Masjid Raya Sumatera Barat dan Masjid Agung Pekanbaru."},
            {"Masjid Cheng Ho","15 Ulu, Kecamatan Seberang Ulu I, Kota Palembang, Sumatera Selatan 30267"}
    };

    public class ArrayList<ModelMasjid> ambilDataMasjid(){
        ArrayList<ModelMasjid> dataMasjid = new ArrayList<>();

        for (String[] varData: data ){
            ModelMasjid mdl = new ModelMasjid();
            mdl.setNama(varData[0]);
            mdl.setTentang(varData[1]);
            mdl.setFoto(varData[2]);
            mdl.setAlamat(varData[3]);
            mdl.setKoordinat(varData[4]);

            dataMasjid.add(mdl);
        }
        return dataMasjid;
    }
}