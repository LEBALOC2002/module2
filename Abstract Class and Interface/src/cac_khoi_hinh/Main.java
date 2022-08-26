package cac_khoi_hinh;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(5);
        System.out.println("hình chữ nhật " + rectangle.getWidth() + " " + rectangle.getHeight() + " " + rectangle.x + " " + rectangle.y );
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Circle " + circle.getRadius() + " " + circle.x + " " + circle.y );
    }
}
