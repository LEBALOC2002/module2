package Static_Property;

public class Static_Property {
    private  String name ;
    private  String engine ;
    public  static  int numberofcars ;
    public  Static_Property (String name , String engine) {
    this.name= name;
    this.engine =  engine;
    numberofcars ++ ;
    }
}
