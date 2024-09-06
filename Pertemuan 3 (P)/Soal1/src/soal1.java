/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 input & output
**/

import java.util.Scanner;
import java.util.StringTokenizer;

public class soal1 {
    public static void main(String[] args) {
        //declaration
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input string : ");
        //assignment
        String s = input.nextLine();
        //Algoritma Pemisahan String
        StringTokenizer a = new StringTokenizer(s," !,?._'@");
        System.out.println(a.countTokens());
        while (a.hasMoreTokens()) {
            System.out.println(a.nextToken());
        }
    }
}
