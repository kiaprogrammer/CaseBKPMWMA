package com.example.casebkpm.activity_tigabelas_enambelas.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.casebkpm.R;
import com.example.casebkpm.activity_tigabelas_enambelas.model.Mahasiswa;

import java.util.ArrayList;

public class AdapterMahasiswa extends RecyclerView.Adapter<MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public AdapterMahasiswa(ArrayList<Mahasiswa> dataList){
        this.dataList = dataList;
    }

    public void updateData(ArrayList<Mahasiswa> newData) {
        this.dataList = newData;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_item, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.nama.setText(dataList.get(position).getNama());
        holder.npm.setText(dataList.get(position).getNpm());
        holder.noHp.setText(dataList.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
