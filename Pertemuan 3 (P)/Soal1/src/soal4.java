import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        int item = 50000;
        byte terjual = 0;
        Scanner input = new Scanner(System.in);
        while(true){
            int gajipokok = 500000;
            int bonus = 0;
            System.out.println("Masukan item yang terjual : ");
            terjual = input.nextByte();
            if (terjual >= 40){
                bonus = (int) (terjual * (item * 0.25));
            } else if (terjual > 80) {
                bonus = (int) (terjual * (item * 0.35));
            } else if (terjual < 15){
                gajipokok = (int) (gajipokok - (item * 0.15));
            }else{
                bonus = (int) (terjual * (item * 0.10));
            }
            gajipokok += bonus;
            System.out.println("Berarti gaji pokok nya : " + gajipokok);
        }
    }
}