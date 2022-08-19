package he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 0.1;

    public Circle() {
    }
    public Circle (double radius){
        this.radius = radius;

    }
    public Circle (double radius , String color , boolean filled){
        super(color, filled);
        this.radius = radius ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return  radius * radius * Math.PI;
    }
    public double getPrimeter(){
        return 2 * radius * radius  * Math.PI ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString()+
                '}';
    }
}
