package Access_modifier;

public class Access_modifier_BT {
    private double radius = 1.0 ;
    private String color = "red";
    public Access_modifier_BT(){

    }
    public static  int radiuscolor ;
    public Access_modifier_BT (double radius){
        this.radius = radius ;
    }
    public  double getRadius (){
        return  radius ;
    }
    public  double getArea(){
        return radius*radius * Math.PI;
    }
}
