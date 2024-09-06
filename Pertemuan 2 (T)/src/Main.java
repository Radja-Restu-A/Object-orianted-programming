/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
**/

import java.util.Scanner;


public class Main {
    //Function hitung nilai yang sesuai dengan formula yang dibutuhkan
    static double hitungNilai(double tugas, double uts, double uas){
        return 0.20 * tugas + 0.35 * uts + 0.45 * uas;
    }
    //Function Grading merupakan pengkondisian sesuai dengan niali yang diberikan
    static char grading(double nilai){
        if (nilai >= 80) {
            return 'A';
        } else if (nilai >= 75) {
            return 'B';
        } else if (nilai >= 65) {
            return 'C';
        } else if (nilai >= 49) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        while(true){
            //Declaration
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Nilai Tugas : ");
            double nilaiTugas = input.nextDouble();

            System.out.print("Masukan Nilai UTS : ");
            double nilaiUts = input.nextDouble();

            System.out.print("Masukan Nilai UAS : ");
            double nilaiUas = input.nextDouble();
            
            double nilaiAkhir = hitungNilai(nilaiTugas,nilaiUts,nilaiUas);
            char grade = grading(nilaiAkhir);
            //output
            System.out.println("Nilai akhir : " + grade + "\n");
        }
    }
}
