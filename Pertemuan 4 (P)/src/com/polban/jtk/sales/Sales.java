package com.polban.jtk.sales;

import com.polban.jtk.sales.Product;

// Kelas Sales untuk mengelola transaksi penjualan
public class Sales {
    private Product product;

    // Constructor
    public Sales(Product product) {
        this.product = product;
    }

    // Metode untuk melakukan penjualan
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan... ");
        product.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " +
                product.getStock());
    }

    // Metode untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok... ");
        product.addStock(quantity);
        System.out.println("Stok setelah penambahan: " +
                product.getStock());
    }

    // Metode untuk memperbarui harga produk
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk... ");
        product.setPrice(newPrice);
        String prin = String.format("Harga baru: is %.02f ",product.getPrice());
        System.out.println("Harga baru: " + prin);
    }
}