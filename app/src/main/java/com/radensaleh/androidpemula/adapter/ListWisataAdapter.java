package com.radensaleh.androidpemula.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.radensaleh.androidpemula.R;
import com.radensaleh.androidpemula.entity.Wisata;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Wisata> listWisata;

    public ListWisataAdapter(Context mContext, ArrayList<Wisata> listWisata) {
        this.mContext = mContext;
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_wisata, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvNama.setText(listWisata.get(i).getNama());
        viewHolder.tvTiket.setText(listWisata.get(i).getTiketMasuk());

        Glide.with(mContext)
                .load(listWisata.get(i).getFoto())
                .apply(new RequestOptions().override(75, 75))
                .into(viewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvTiket;
        ImageView imgPhoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
                tvNama = itemView.findViewById(R.id.tvNama);
                tvTiket= itemView.findViewById(R.id.tvTiket);
                imgPhoto= itemView.findViewById(R.id.imgPhoto);
        }
    }
}
