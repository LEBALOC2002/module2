package Lop_point2D_and_Lop_point3D;

public class Lop_Point2d {
    private float x = 0.0f;
    private float y = 0.0f;

    public Lop_Point2d() {
    }

    public float getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY() {
        this.y = y;
    }

    public Lop_Point2d (float x , float y){

        this.x= x ;
        this.y = y;

    }

    @Override
    public String toString() {
        return " " +
                "x=" + x +
                ", y=" + y ;
    }
}
