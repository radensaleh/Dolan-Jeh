package com.radensaleh.androidpemula.entity;

public class Wisata {
    private String id;
    private String nama;
    private String penjelasan;
    private String foto;
    private String tiketMasuk;
    private String alamat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTiketMasuk() {
        return tiketMasuk;
    }

    public void setTiketMasuk(String tiketMasuk) {
        this.tiketMasuk = tiketMasuk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
