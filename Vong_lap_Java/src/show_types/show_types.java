package show_types;

import java.util.Scanner;
public class show_types {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu"); // in ra menu
            System.out.println("1. Draw the rectangle"); // in ra hình chữ nhật
            System.out.println("2. Draw the triangle bot-left");//Vẽ hình tam giác dưới bên trái
            System.out.println("3. Draw the triangle top-left");//Vẽ hình tam giác trên bên trái
            System.out.println("4. Draw the isosceles triangle"); //Vẽ tam giác cân
            System.out.println("0. Exit"); // in ra exit
            System.out.println("Enter your choice: "); // in ra cho lư chọn 1 trong 5 kết quả trên
            choice = scanner.nextInt(); // gán biến choice bằng nhập vào
            switch (choice) {
                case 1 :
                    System.out.println("Draw the rectangle"); // in ra hình chữ nhật
                    for(int i = 1; i < 4 ; i++){ // chạy vòng lặp i = 1 ; i bé hơn 4 ; i tăng lên một giá trị
                        for(int j = 1; j < 7; j++){ // chạy luồng trong vòng lặp j nằng 1 ; j bé hơn 7 ; tăng lên 1 giá trị
                            System.out.print("*  "); // in * và khoảng trống
                        }
                        System.out.printf("\n"); // in ra xuống dòng
                    }
                    break; // thỏa mãn dừng vòng lặp
                case 2 :
                    System.out.println("Draw the triangle bot-left"); //Vẽ hình tam giác dưới bên trái
                    for (int i = 1; i < 7; i++) { // chạy vòng lặp i = 1 ; i bé hơn 7 ; i tăng lên một giá trị
                        for (int j = 1; j < i; j++) { //  chạy vòng lặp j = 1 ; j bé hơn i ; j tăng lên một giá trị
                            System.out.print("*  "); //in ra * khoảng trống
                        }
                        System.out.println("\n");// xuống dòng trong vòng lặp
                    }
                    break; //thỏa mãn điều kiện thì dừng vòng lặp
                case 3 :
                    System.out.println("Draw the triangle top-left");//Vẽ hình tam giác trên bên trái
                    for (int i = 7; i > 1; i--) {  // chạy vòng lặp i = 7 ; i lớn hơn 1  ; i giảm lên một giá trị
                        for (int j = 1; j < i; j++) { //  chạy vòng lặp j = 1 ; j bé hơn i ; j tăng lên một giá trị
                            System.out.print("*  "); // in ra * khoảng trống
                        }
                        System.out.println("\n"); // xuống dòng
                    }
                    break; // thỏa mãn điều kiện thì thoát khỏi vòng lặp
                case 4:

                    System.out.println("Draw the isosceles triangle"); // in ra giá trị của tam giác cân
                    for (int i = 1; i < 5; i++ ){ // vòng lặp cho i = 1 ; i bé hơn 5 ; tăng lên 1 giá trị
                        for (int j = 1; j <= 5 - i; j++){ // vòng lặp j = 1 ; j sẽ bé hơn hoặc bằng 5 - i ; j tăng lên 1 giá trị
                            System.out.print("  "); // in ra khoảng trống
                        }

                        for (int k = 0; k != 2 * i - 1; k++) { // vòng lặp k = 0 ; k mà khác bằng 2 nhân với i - 1 ; k tang lên 1
                            System.out.print("* "); // in ra giá trị * khoảng trống
                        }
                        System.out.println();
                    }
                    break; // dừng vòng ặp
                case 0 :
                    System.exit(0); // exit
                default: // dừng lại
                    System.out.println("No choice!"); // in ra k chọn gì cả
            }
        }
    }
}