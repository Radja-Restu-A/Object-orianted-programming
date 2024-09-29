public class Soal1 {
    public static void main(String[] args){
       Circle circle = new Circle();
       System.out.println(circle.toString());
       circle = new Circle(20,"Blue");
       System.out.println(circle.toString());
       circle.setColor("Hijau telor asin");
       System.out.println(circle.toString());


    }
}
