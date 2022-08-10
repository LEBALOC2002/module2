package thuchanh_toantu;

import java.util.Scanner;

public class thuchanh_toantu {
    public static void main(String[] args) {
        float wight ;
        float heigth;
        Scanner scanner = new Scanner(System.in); // khai báo đối tượng scanner
        System.out.println("enter wight");
        wight = scanner.nextFloat(); // nhập chiều rộng
        System.out.println("enter heigth");
        heigth = scanner.nextFloat(); // nhập chiều dài
        float area = wight*heigth;
        System.out.println("diện tích là " + area);
    }
}
