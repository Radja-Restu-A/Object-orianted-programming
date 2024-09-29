public class Square extends Rectangle {
    public Square(double side) {
        super(side,side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "A Square with side = " + super.getWidth() +
                ", which is a subclass of " + super.toString();
    }

}
