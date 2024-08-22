/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Pengoptimalan penggunaan jenis variabel
 **/

public class Soal2 {
    public static void main(String[] args) {
        /** Assignment variabel **/
        int i = 42;

        /** Penggunaan metode Ternary sebagai pengkondisian dibanding if**/
        String s = (i < 40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
