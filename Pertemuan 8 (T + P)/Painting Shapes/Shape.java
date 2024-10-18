abstract class Shape {
    protected String nameShape;

    public Shape(String nameShape){
        this.nameShape = nameShape;
    }

    public abstract double area();

    public String toString() {
        return "nameShape = " + nameShape;
    }
}
