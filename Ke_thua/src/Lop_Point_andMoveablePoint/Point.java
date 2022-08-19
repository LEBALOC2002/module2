package Lop_Point_andMoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxy(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getxy() {
        float[] getxy = {x, y};
        return getxy;
    }

    @Override
    public String toString() {
        return
                " x=" + x +
                        ", y= " + y;
    }
}
