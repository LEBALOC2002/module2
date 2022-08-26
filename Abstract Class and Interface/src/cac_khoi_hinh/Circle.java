package cac_khoi_hinh ;
public class Circle extends Shape{
    private double radius ;
    public Circle (int _y , int _x , double _r){
        super(_x, _y);
        this.radius = _r ;
    }
    public  Circle () {}
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }
}

