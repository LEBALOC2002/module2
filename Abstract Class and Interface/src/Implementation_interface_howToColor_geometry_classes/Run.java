package Implementation_interface_howToColor_geometry_classes;

public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i] = getRandomShape();
        }
        Shape.printShape(shapes);
        for (Shape x : shapes) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }


    }

    static Shape getRandomShape() {
        int radom = (int) (Math.round(Math.random() * 2));
        switch (radom) {
            case 0:
                return new Square(10);
            case 1:
                return new Rectangle(10, 20);
            default:
                return new Circle(10);
        }
    }
}
