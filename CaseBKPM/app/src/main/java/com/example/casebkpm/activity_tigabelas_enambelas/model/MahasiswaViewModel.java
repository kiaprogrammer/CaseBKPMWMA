package com.example.casebkpm.activity_tigabelas_enambelas.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MahasiswaViewModel extends ViewModel {
    private final MutableLiveData<ArrayList<Mahasiswa>> mahasiswaList = new MutableLiveData<>(new ArrayList<>());

    public LiveData<ArrayList<Mahasiswa>> getMahasiswaList() {
        return mahasiswaList;
    }

    // Menambah data ke dalam list
    public void addMahasiswa(String nama, String npm, String noHp) {
        ArrayList<Mahasiswa> currentList = mahasiswaList.getValue();
        currentList.add(new Mahasiswa(nama, npm, noHp));
        mahasiswaList.setValue(currentList);  // Update LiveData sehingga UI bisa terupdate
    }
}

