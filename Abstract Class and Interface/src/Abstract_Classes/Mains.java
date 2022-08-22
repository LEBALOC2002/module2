package Abstract_Classes;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() {
            @Override
            public double getArea() {
                return 7;
            }

            @Override
            public double getPerimeter() {
                return 7;
            }
        }
    }
}
