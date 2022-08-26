package cac_khoi_hinh;

public abstract class Shape {
    protected int x = 8 , y = 9;
    protected Shape(int _x  , int _y ) {
        this.x = _x;
        this.y = _y;
    }
    public Shape(){}

    abstract public void draw();
    abstract public void erase ();
    public void moveTo (int _y , int _x){
        erase();
        this.x = _x ;
        this.y = _y ;
        draw();
    }
}
