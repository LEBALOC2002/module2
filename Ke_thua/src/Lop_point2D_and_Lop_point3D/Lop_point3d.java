package Lop_point2D_and_Lop_point3D;

public class Lop_point3d extends Lop_Point2d {
    private float z = 0.0f;

    public Lop_point3d() {
    }

    public Lop_point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setxyz() {
        this.z = z;
    }

    public void getxyz() {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Lop_point3d{" + super.toString() + " z=" + z +
                '}';
    }

}


