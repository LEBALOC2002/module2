package Lop_Point_andMoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.getX();
        point.getY();
        System.out.println( "POINT " + point.getX()  + " " + point.getY());
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.toString() ;
        System.out.println(moveablePoint);
    }
}
