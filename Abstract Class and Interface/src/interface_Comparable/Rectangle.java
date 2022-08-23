package interface_Comparable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double lengt = 1.0;

    public Rectangle() {

    }

    public Rectangle(double height, double lengt) {

        this.width = height;
        this.lengt = lengt;
    }

    public Rectangle(double height, double lengt, String color, boolean filled) {
        super(color, filled);
        this.lengt = lengt;
        this.width = height;
    }

    public double getHeight() {
        return width;
    }

    public void setHeight(double height) {
        this.width = height;
    }

    public double getLengt() {
        return lengt;
    }

    public void setLengt(double lengt) {
        this.lengt = lengt;
    }
     public double getArea (){
        return width * this.lengt ;
     }
     public  double getPerimeter (){
        return 2 * (width * this.lengt) ;
     }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lengt=" + lengt + super.toString() +
                '}';
    }
}
