package LOP_HINH_CHU_NHAT;

import java.util.Scanner;

public class LOP_HINH_CHU_NHAT {
    double height, width;

    public LOP_HINH_CHU_NHAT() {

    }

    public LOP_HINH_CHU_NHAT(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public  double getPerimeter(){
        return  (this.width + this.height)*2 ;
    }
    public String display (){
        return "LOP_HINH_CHU_NHAT{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập số height");
        double height = scanner.nextDouble();
        System.out.println("vui lòng nhập số width");
        double widht = scanner.nextDouble();
        LOP_HINH_CHU_NHAT lop_hinh_chu_nhat = new LOP_HINH_CHU_NHAT( height,widht);
        System.out.println("Hình chữ nhật của bạn \n"+ lop_hinh_chu_nhat.display());
        System.out.println("Chu vi của hình chữ nhật: "+ lop_hinh_chu_nhat.getPerimeter());
        System.out.println("Diện tích Hình chữ nhật: "+ lop_hinh_chu_nhat.getArea());

    }
}
