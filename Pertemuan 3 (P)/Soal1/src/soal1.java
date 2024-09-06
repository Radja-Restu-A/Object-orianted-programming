import java.util.Scanner;
import java.util.StringTokenizer;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input string : ");
        String s = input.nextLine();
        StringTokenizer a = new StringTokenizer(s," !,?._'@");
        System.out.println(a.countTokens());
        while (a.hasMoreTokens()) {
            System.out.println(a.nextToken());
        }
    }
}