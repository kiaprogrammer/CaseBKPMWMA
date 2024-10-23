package com.example.casebkpm.activity_tigabelas_enambelas.model;

public class Mahasiswa {
    private String nama;
    private String npm;
    private String noHp;

    public Mahasiswa(String name, String npm, String noHp){
        this.nama = name;
        this.npm = npm;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
