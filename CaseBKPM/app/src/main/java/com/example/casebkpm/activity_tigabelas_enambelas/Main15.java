package com.example.casebkpm.activity_tigabelas_enambelas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.casebkpm.R;
import com.example.casebkpm.activity_tigabelas_enambelas.adapter.AdapterMahasiswa;
import com.example.casebkpm.activity_tigabelas_enambelas.adapter.MahasiswaViewHolder;
import com.example.casebkpm.activity_tigabelas_enambelas.model.Mahasiswa;

import java.util.ArrayList;

public class Main15 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMahasiswa adapterMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Adnan", "eeiaof", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Peno", "1234", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Rana", "ew3r", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Bagas", "324", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Jos", "azgr", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Adnan", "eeiaof", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Peno", "1234", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Rana", "ew3r", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Bagas", "324", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Jos", "azgr", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Adnan", "eeiaof", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Peno", "1234", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Rana", "ew3r", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Bagas", "324", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Jos", "azgr", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Adnan", "eeiaof", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Peno", "1234", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Rana", "ew3r", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Bagas", "324", "08320234"));
        mahasiswaArrayList.add(new Mahasiswa("Jos", "azgr", "08320234"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main15);

        addData();

        recyclerView = findViewById(R.id.recyleView);

        adapterMahasiswa = new AdapterMahasiswa(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapterMahasiswa);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}