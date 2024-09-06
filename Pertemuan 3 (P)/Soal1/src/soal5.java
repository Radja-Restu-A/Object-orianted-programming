/**
 Nama  : Radja Restu Arsita
 Kelas : 2B - D3
 Buka tutup jalan
**/

import java.util.Scanner;
public class soal5{
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        int[] plat = new int[4];
        int total = 0;
        //input
        System.out.println("Masukan plat nomor : ");
        String[] temp = input.nextLine().split(" ");
        //algoritma utama
        for(int i = 0; i < 4;i++){
            plat [i] = Integer.parseInt(temp[i]);
            total += plat[i];
        }
        total -= 999999;
        //output
        if (total % 5 == 0){
            System.out.print("Berhenti");
        }else{
            System.out.print("Jalan");
        }
    }
}
