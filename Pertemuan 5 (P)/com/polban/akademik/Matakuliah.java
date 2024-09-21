package com.polban.akademik;

public class Matakuliah {
    private String namaMatkul;
    private String pengampu;

    public Matakuliah(String namaMatkul,Dosen pengampu){
        this.namaMatkul = namaMatkul;
        this.pengampu = pengampu.getNama();
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getPengampu() {
        return pengampu;
    }

    public void setPengampu(String pengampu) {
        this.pengampu = pengampu;
    }
}
