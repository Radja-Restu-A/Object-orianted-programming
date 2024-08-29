/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
**/

public class Soal4 {
    //deklarasi function
    static short methodOne(long l) {
        //melakukan casting
        int i = (int) l;
        //mengcast sebelum mereturn nilai
        return (short)i;
    }
    public static void main(String[] args) {
        //deklarasi variabel
        double d = 10.25;
        //cast
        float f = (float) d;
        //cast
        byte b = (byte) methodOne((long) f);
        //menampilkan output
        System.out.println(b);
    }
}
