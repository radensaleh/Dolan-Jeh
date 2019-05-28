package com.radensaleh.androidpemula.activity;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.radensaleh.androidpemula.R;
import com.radensaleh.androidpemula.adapter.CardViewWisataAdapter;
import com.radensaleh.androidpemula.adapter.GridWisataAdapter;
import com.radensaleh.androidpemula.adapter.ListWisataAdapter;
import com.radensaleh.androidpemula.data.WisataData;
import com.radensaleh.androidpemula.entity.ItemClickSupport;
import com.radensaleh.androidpemula.entity.Wisata;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Wisata> listWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.titleList);

        recyclerView = findViewById(R.id.rvList);
        recyclerView.setHasFixedSize(true);

        listWisata.addAll(WisataData.getListData());

        listWisata();

    }

    public void listWisata(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(this, listWisata);
        recyclerView.setAdapter(listWisataAdapter);

        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                detailWisata(listWisata.get(position).getNama(), listWisata.get(position).getFoto(), listWisata.get(position).getPenjelasan(), listWisata.get(position).getTiketMasuk(), listWisata.get(position).getAlamat());
            }
        });
    }

    public void gridWisata(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridWisataAdapter gridWisataAdapter = new GridWisataAdapter(this, listWisata);
        recyclerView.setAdapter(gridWisataAdapter);

        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                detailWisata(listWisata.get(position).getNama(), listWisata.get(position).getFoto(), listWisata.get(position).getPenjelasan(), listWisata.get(position).getTiketMasuk(), listWisata.get(position).getAlamat());
            }
        });
    }

    public void cardWisata(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataAdapter cardViewWisataAdapter = new CardViewWisataAdapter(this, listWisata);
        recyclerView.setAdapter(cardViewWisataAdapter);

        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                detailWisata(listWisata.get(position).getNama(), listWisata.get(position).getFoto(), listWisata.get(position).getPenjelasan(), listWisata.get(position).getTiketMasuk(), listWisata.get(position).getAlamat());
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
        switch (item.getItemId()){
            case R.id.action_list:
                setTitle(R.string.titleList);
                listWisata();
                break;
            case R.id.action_grid:
                gridWisata();
                setTitle(R.string.titleGrid);
                break;
            case R.id.action_cardview:
                cardWisata();
                setTitle(R.string.titleCard);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void detailWisata(String nama, String foto, String penjelasan, String tiket, String alamat){
        Intent i = new Intent(MainActivity.this, DetailWisataActivity.class);
        i.putExtra("nama", nama);
        i.putExtra("foto", foto);
        i.putExtra("penjelasan", penjelasan);
        i.putExtra("tiket", tiket);
        i.putExtra("alamat", alamat);
        startActivity(i);
    }

}
