package interface_Comparable;

public class Circle_Test {
    public static void main(String[] args) {
     Circle circle = new Circle() ;
     circle.setRadius(4);
        System.out.print(" Radius " + circle.getRadius() + "\n Area " + circle.getArea() + "\n Perimeter " + circle.getPerimeter() + " \n color circle " +  circle.getColor() + "\n Filled circle " + circle.isFilled());
    }
}
