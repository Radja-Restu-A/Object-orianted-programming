import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(20,35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10,30);

        double deckAmt = paint.amount(deck);
        double bigBallAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\n Number of gallons of paint needed ...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("BigBall " + fmt.format(bigBallAmt));
        System.out.println("tank " + fmt.format(tankAmt));
    }
}
