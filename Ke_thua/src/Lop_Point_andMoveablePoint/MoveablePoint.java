package Lop_Point_andMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
        setxy(x, y);
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {this.xSpeed, this.xSpeed};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint  " +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed + super.toString()
                ;
    }
    public MoveablePoint move (){
        super.setX(super.getX() + xSpeed) ;
        super.setY(super.getY() + ySpeed) ;
        return  this;
    }
}

