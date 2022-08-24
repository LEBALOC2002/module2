package Refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = baseArea(radius) ;
        double perimeter = getPerimeter(radius);
        double volume = volume ( height , baseArea , getPerimeter(radius)) ;
        return volume;
    }
    private static double getPerimeter (int  radius){
      return 2 * Math.PI  * radius;
    }
    private static double baseArea (int radius) {
        return Math.PI * radius * radius;
    }
    private static double volume ( int height , double perimeter , double baseArea){
        return  perimeter * height + 2 * baseArea;
    }
}
