/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
**/

public class soal2b {
    //deklarasi dan assignment variabel global
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        //deklarasi variabel lokal
        double paperWidth = 8.5;
        double paperHeight = 11;
        //tampilkan output
        System.out.println("Paper size in centimeters: " + paperWidth *
                CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
