
public class Main {
    public static void main (String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        Square square = new Square(4);
        System.out.println(square.toString());
    }
}
