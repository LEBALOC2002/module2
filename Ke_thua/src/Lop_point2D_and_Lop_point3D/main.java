package Lop_point2D_and_Lop_point3D;

public class main {
    public static void main(String[] args) {
        Lop_Point2d lop_point2d = new Lop_Point2d();
        lop_point2d.setY();
        lop_point2d.setX();
        System.out.println("lop point2d  " + lop_point2d.getX() + " " + lop_point2d.getY());
        Lop_point3d lop_point3d = new Lop_point3d();
        lop_point3d.setxyz();
        System.out.println(  lop_point3d.toString());
    }
}
