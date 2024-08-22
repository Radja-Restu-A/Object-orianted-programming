/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
 **/

public class Soal1{
    public static void main(String[] args) {
        /** Assignment variabel **/
        byte angka1 = 125;
        byte angka2 = 6;

        /** Penjumlahan yang menyebabkan melebihi kapasitas variabel **/
        byte hasil = (byte) (angka1+angka2);

        /** Print Hasil **/
        System.out.println("hasil 1 = " + hasil);
    }
}
