package Abstract_Classes;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "green";
    private boolean filled;
    private Date dataCreated;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dataCreated=" + dataCreated +
                '}';
    }

    public abstract double getArea();


    public abstract double getPerimeter();

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }
}
