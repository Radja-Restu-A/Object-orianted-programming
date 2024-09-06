import java.util.Scanner;
public class soal5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] plat = new int[4];
        int total = 0;
        System.out.println("Masukan plat nomor : ");
        String[] temp = input.nextLine().split(" ");
        for(int i = 0; i < 4;i++){
            plat [i] = Integer.parseInt(temp[i]);
            total += plat[i];
        }
        total -= 999999;
        if (total % 5 == 0){
            System.out.print("Berhenti");
        }else{
            System.out.print("Jalan");
        }
    }
}
