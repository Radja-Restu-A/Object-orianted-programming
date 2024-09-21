package com.polban.akademik;

public class Dosen extends Person {
    String NIP;
    public Dosen (String nip, String nama){
        super(nama);
        this.NIP = nip;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}