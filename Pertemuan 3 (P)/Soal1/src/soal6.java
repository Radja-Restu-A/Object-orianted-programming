import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        BigInteger a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        System.out.print(a.add(b)+"\n");
        System.out.print(a.multiply(b));
    }
}
