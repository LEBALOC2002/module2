package Tinhsongaytrongthang;

import java.util.Scanner;

public class calculate_the_number_of_days_in_the_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tính ngày vào tháng nào?");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                System.out.println("Tháng '2' có 28 hoặc 29 ngày!");
                daysInMonth = " 28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng '" + month + " ' có 31 ngày!");
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng '" + month + " ' có 30 ngày!");
                daysInMonth = "30";
                break;
            default:
                System.out.println("Invalid input!");
                daysInMonth = "";

                if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
                else System.out.print("Invalid input!");
        }

    }
}
