package com.radensaleh.androidpemula.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.radensaleh.androidpemula.R;
import com.radensaleh.androidpemula.entity.Wisata;

import java.util.ArrayList;

public class DetailWisataActivity extends AppCompatActivity {

    private TextView tvNama, tvTiket, tvAlamat, tvPenjelasan;
    private ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        tvNama   = findViewById(R.id.tvNama);
        tvTiket  = findViewById(R.id.tvTiket);
        tvAlamat = findViewById(R.id.tvAlamat);
        tvPenjelasan = findViewById(R.id.tvPenjelasan);

        imgPhoto = findViewById(R.id.imgPhoto);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        String nama = (String) b.get("nama");
        String foto = (String) b.get("foto");
        String penjelasan = (String) b.get("penjelasan");
        String tiket = (String) b.get("tiket");
        String alamat = (String) b.get("alamat");

        setTitle(nama);
        tvNama.setText(nama);
        tvTiket.setText(tiket);
        tvAlamat.setText(alamat);
        tvPenjelasan.setText(penjelasan);

        Glide.with(this)
                .load(foto)
                .apply(new RequestOptions().override(200, 200))
                .into(imgPhoto);

    }
}
