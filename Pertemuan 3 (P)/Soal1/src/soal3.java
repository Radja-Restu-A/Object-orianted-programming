import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Masukan input : ");
            String[] temp = input.nextLine().split(" ");
            short a = Short.parseShort(temp[0]);
            Short b = Short.parseShort(temp[2]);
            if(a > 1000 || a < 1) {
                System.out.print("Input diluar scoope\n");
            }else if(b > 1000 || b < 1){
                System.out.print("Input diluar scoope\n1");
            }else{
                int hasil = 0;
                float hasil2 = 0;
                if (temp[1].compareTo("+") == 0) {
                    hasil = a + b;
                } else if (temp[1].compareTo("-") == 0) {
                    hasil = a - b;
                } else if (temp[1].compareTo("*") == 0) {
                    hasil =  a * b;
                } else if (temp[1].compareTo("/") == 0) {
                    hasil2 = (float) a / b;
                } else if (temp[1].compareTo("%") == 0) {
                    hasil = (a % b);
                }
                if (hasil != 0) {
                    System.out.println(hasil);
                }else{
                    System.out.println(hasil2);
                }
            }
        }
    }
}
