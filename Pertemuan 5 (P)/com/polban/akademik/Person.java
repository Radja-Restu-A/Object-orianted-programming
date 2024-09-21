package com.polban.akademik;

abstract public class Person {
    private String nama;
    public Person(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}


