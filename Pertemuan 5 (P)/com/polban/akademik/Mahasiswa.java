package com.polban.akademik;

public class Mahasiswa extends Person {
    String NIM;
    public Mahasiswa (String nim, String nama){
        super(nama);
        this.NIM = nim;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}
