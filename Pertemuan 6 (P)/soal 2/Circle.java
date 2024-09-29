public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimiter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius = " + radius + ", whicch is a subclass of " + super.toString();
    }
}
