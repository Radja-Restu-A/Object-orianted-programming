import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan string A : ");
        String A = input.nextLine();

        String capitalA = A.substring(0,1).toUpperCase();
        System.out.print("Masukan string B : ");
        String B = input.nextLine();

        String capitalB = B.substring(0,1).toUpperCase();
        System.out.println(A.length() + B.length());

        if(A.compareToIgnoreCase(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.print(capitalA + A.substring(1) +" " + capitalB + B.substring(1));
    }
}