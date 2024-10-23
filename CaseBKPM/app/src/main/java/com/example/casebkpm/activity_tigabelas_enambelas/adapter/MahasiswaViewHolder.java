package com.example.casebkpm.activity_tigabelas_enambelas.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.casebkpm.R;

import org.w3c.dom.Text;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder {

    TextView nama;
    TextView npm;
    TextView noHp;

    public MahasiswaViewHolder(@NonNull View itemView) {
        super(itemView);
        nama = itemView.findViewById(R.id.namaMahasiswa);
        npm = itemView.findViewById(R.id.npmMahasiswa);
        noHp = itemView.findViewById(R.id.noHpMahasiswa);


    }
}
