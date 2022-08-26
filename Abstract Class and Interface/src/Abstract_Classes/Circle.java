package Abstract_Classes;

import static java.lang.Math.PI;

public class Circle extends GeometricObject {
    private double radius ;
    public Circle () {}
    public Circle ( double radius){
        this.radius = radius ;
    }
    public Circle (double radius , String color , boolean filled){
        this.radius = radius ;
    }

    public double getRadius() {
        return radius * radius * PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
