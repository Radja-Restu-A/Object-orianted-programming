package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju",10);
        barangs[1] = new Barang("002","Celana",20);
    }

    void showBarang() {
        System.out.println(barangs[0].getNama_barang() + "(" +
                barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama_barang() + "(" +
                barangs[1].getStok() + ")");
    }

    public void pengadaan() {
        initBarang();
        barangs[0].setStok(barangs[0].getStok()+20);
        showBarang();
    }
}