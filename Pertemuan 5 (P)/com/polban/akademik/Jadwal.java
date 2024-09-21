package com.polban.akademik;

public class Jadwal {
    private String Hari;
    private String[] infoRuangan;


    public Jadwal(String hari) {
        this.Hari = hari;
    }

    public String getHari() {
        return Hari;
    }

    public void setHari(String hari) {
        Hari = hari;
    }
}
