package com.example.myapplication;

public class History {

    private String pemasukkan;
    private String pengeluaran;
    private String keterangan;

    public History(String pemasukkan, String pengeluaran, String keterangan) {
        this.pemasukkan = pemasukkan;
        this.pengeluaran = pengeluaran;
        this.keterangan = keterangan;
    }

    public String getPemasukkan() {
        return pemasukkan;
    }

    public void setPemasukkan(String pemasukkan) {
        this.pemasukkan = pemasukkan;
    }

    public String getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(String pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
