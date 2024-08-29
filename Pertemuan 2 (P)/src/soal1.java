/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
**/

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        /* Menerima input pengulangan*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Bearapa kali anda ingin Mengecek nomor :");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            try {
                /*Menerima input nomor yang akan di cek*/
                System.out.print("\n"+"Masukan nomor :");
                long n = sc.nextLong();
                /*Menampilkan Output*/
                System.out.println(n + " can be fitted in:");
                /*Kondisi untuk tipedata Byte*/
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                /*Kondisi untuk tipedata short*/
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                /*Kondisi untuk tipedata Integer*/
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                /*Kondisi untuk tipedata Long*/
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            /* Kondisi validasi */
            //jika input yang dimasukan diluar long maka output nya ini
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}

