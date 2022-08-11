package Menu_design_fo_apps;

import java.util.Scanner;

public class Menu_design_fo_apps {
    public static void main(String[] args) {
        int choice = -1; //  kiểu dữ liệu gán biến cho choice bằng -1
        Scanner input = new Scanner(System.in); //in ra giá trị
        while(choice != 0) {  // trong khi biến choice khác bằng 0
            System.out.println("Menu"); // in ra giá trị Menu
            System.out.println("1. Draw the triangle"); // in ra giá trị của 1
            System.out.println("2. Draw the square"); // in ra giá trị của 2
            System.out.println("3. Draw the rectangle"); // in ra giá trị của 3
            System.out.println("0. Exit"); // ấn exit
            System.out.println("Enter your choice: "); // nhập số muốn lựa chọn
            choice = input.nextInt(); // biến choice bằng in ra bằng kiểu số nguyên
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!"); // dừng lại và in không có sự lựa chọn
            }
        }
    }
}
