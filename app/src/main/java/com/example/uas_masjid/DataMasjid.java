package com.example.uas_masjid;

import android.view.Display;

import java.util.ArrayList;

public class DataMasjid{
    public static String[][] data = new String[][]{
            {"Masjid Agung Palembang","Jl. Jend Sudirman, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30111\n"+
                    "Masjid Agung Palembang (Indonesia Masjid Agung Palembang), juga dikenal sebagai Masjid Agung Sultan Mahmud Badaruddin I setelah mantan Sultan Palembang, adalah masjid utama Palembang, ibukota Sumatera Selatan. Masjid ini merupakan masjid terbesar di Sumatera Selatan, dan masjid terbesar ketiga di Sumatera setelah Masjid Raya Sumatera Barat dan Masjid Agung Pekanbaru."},
            {"Masjid Cheng Ho","15 Ulu, Kecamatan Seberang Ulu I, Kota Palembang, Sumatera Selatan 30267\n"+
                    "Masjid Zheng He, secara resmi Masjid Islam Mohammed Zheng He di Sriwijayan Palembang (bahasa Indonesia: Masjid Al-Islamiyyah Muhammad Cheng Ho Sriwijaya Palembang), adalah sebuah masjid yang didedikasikan untuk umat Tionghoa Muslim yang terletak di Jakabaring Palembang, Sumatera Selatan, Indonesia. Nama masjid ini untuk menghormati Laksamana Cina Muslim yang terkenal, Zheng He. Masjid ini didirikan atas prakarsa para sesepuh, penasehat, pengurus Persatuan Islam Tionghoa Indonesia (PITI) Sumatera Selatan, serta tokoh masyarakat Tionghoa di sekitar Palembang. Sebelumnya masjid ini dipimpin oleh imam ternama, Ustadz Choirul Rizal yang telah hafal 30 juz' Alquran. Ustadz Miftah yang saat ini menjabat sebagai imam, juga seorang hafiz."},
            {"Masjid Lawang Kidul","Lorong Masjid, Lawang Kidul, Ilir Timur II, Palembang City, Sumatera Selatan 30118\n"+
                    "Masjid Lawang Kidul termasuk salah satu masjid tertua di Palembang, Sumatra Selatan. Masjid ini berdiri pada tahun 1881 dan memegang peran penting baik sebagai pusat penyebaran Islam maupun dijadikan markas para pejuang setempat pada masanya. Material Masjid ini terbuat dari campuran batu kapur dengan putih telur dan pasir, sehingga membuat masjid ini dapat bertahan dengan lama. Bangunan induk masjid ini sebagian besar tetap terjaga keasliannya dan hampir 99 persen masih merupakan bangunan asli dan belum ada yang diganti."},
            {"Masjid Al-Mahmudiyah Suro", "Jl. Ki Gede Ing Suro, Kelurahan 30 Ilir, Kecamatan Ilir Barat II, Palembang, Sumatera Selatan\n"+
                    "Masjid Besar Al-Mahmudiyah atau Masjid Suro adalah salah satu masjid tertua di kota Palembang.Dibangun oleh seorang ulama besar, KH Abdurahman Delamat (Ki Delamat) di atas tanah wakaf milik Kiai Kiagus H Khotib Mahmud tahun 1889 dan selesai tahun 1891. Masjid unik dengan ciri khas melayu ini, awalnya disebut dengan nama Masjid Suro. Lalu Kiagus H. Matjik Rosad, cucu dari Kiagus H Khotib Mahmud mengusulkan nama Al-Mahmudiyah, hingga akhirnya jadilah nama Al-Mahmudiyah."},
            {"Masjid Kiai Muara Ogan","Jl. Kimarogan, Kertapati, Kec. Kertapati, Kota Palembang, Sumatera Selatan 30421\n"+
                    "Masjid Kiai Muara Ogan atau Masjid Ki Marogan adalah salah satu masjid tertua di Palembang, Sumatra Selatan. Masjid ini didirikan oleh Mgs. H. Abdul Hamid (Ki Marogan) seorang ulama Palembang yang sangat terkenal dan usahawan yang sukses pada tahun 1310 H atau 1890. Masjid Ki Marogan ini, merupakan masjid kedua yang dibangun di Palembang setelah Masjid Agung Palembang. Di masa Kesultanan Palembang masjid ini punya peran yang strategis dalam berbagai kegiatan keagamaan dan sosial masyarakat Palembang."},
            {"Masjid Al-Aqobah","PT Pusri, Jl. Melur, Sei Selayur, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30118\n"+
                    "Masjid Al-Aqobah yang dibangun pada tahun 1994. Masjid Al-Aqobah merupakan kategori Masjid Umum. Masjid Al-Aqobah beralamat di Jl. Pupuk Raya Komp Perumahan Pusri Sako Palembang Sumatera Selatan . Masjid Al-Aqobah memiliki luas tanah 200 m2 , luas bangunan 300 m2 dengan status tanah Wakaf."},
            

    };

    public static ArrayList<ModelMasjid> ambilDataMasjid(){
        ArrayList<ModelMasjid> dataMasjid = new ArrayList<>();

        for(String[] varData: data){
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