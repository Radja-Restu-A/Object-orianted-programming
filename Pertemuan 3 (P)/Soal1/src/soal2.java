/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 input & output (2)
**/

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class soal2 {
    public static void main(String[] args) {
        //assignment
        Scanner input = new Scanner(System.in);
        //input
        String[] temp = input.nextLine().split(" ");
        String a = temp[0];
        int b = Integer.parseInt(temp[1]);
        temp = input.nextLine().split(" ");
        String c = temp[0];
        int d = Integer.parseInt(temp[1]);
        temp = input.nextLine().split(" ");
        String e = temp[0];
        //output
        int f = Integer.parseInt(temp[1]);
        System.out.println("================================");
        System.out.printf("%-15s %03d\n",a,b);
        System.out.printf("%-15s %03d\n",c,d);
        System.out.printf("%-15s %03d\n",e,f);
        System.out.println("================================");
    }
}
