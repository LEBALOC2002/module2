package Lop_Circle_and_lop_Cylinder;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area circle : " + circle.getArea());
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(),10);
        System.out.println("total is :" + cylinder.getTotalArea());
    }
}
