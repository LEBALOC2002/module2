package cac_khoi_hinh;

public class Rectangle extends Shape {
 private  int height ;
 private  int width ;

    public Rectangle(int _x, int _y , int height , int width )  {
        super(_x, _y );
        this.height = height;
        this.width = width ;
    }
    public Rectangle(){
        super();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(" Draw Rectangle");
    }

    @Override
    public void erase() {
        System.out.println("erase Rectangle");
    }
}
