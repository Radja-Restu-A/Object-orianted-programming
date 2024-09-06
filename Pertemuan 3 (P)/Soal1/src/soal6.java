/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Big number
**/

import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        //deklarasi
        BigInteger a, b, c;
        //input
        Scanner input = new Scanner(System.in);
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        //algoritma utama + output
        System.out.print(a.add(b)+"\n");
        System.out.print(a.multiply(b));
    }
}
