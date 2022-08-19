package Triangle_class_design_and_implementation;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor();
        System.out.println(" shape " + shape.getColor());
        Triangle triangle = new Triangle();
        triangle.setSide1();
        triangle.setSide2();
        triangle.setSide3();
        System.out.println("Triangle " + triangle.toString());

    }
}

