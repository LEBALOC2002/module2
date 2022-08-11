package tinh_lai_xuat;

import java.util.Scanner;

public class loan_app_billing {
        public static void main(String[] args) {
            double money = 1.0; // khai báo số thực và gán biến là money
            int month = 1; // khai báo kiểu số nguyên và gán biến month
            double interestRate = 1.0; // khai báo số thực và gán biến là interestRate
            Scanner input = new Scanner(System.in);
            System.out.println(" Nhập số tiền muốn vay : "); // in ra số tiền muốn vay
            money = input.nextDouble();
            System.out.println(" Nhập số tháng : "); // in ra số tháng muốn trả hết khoảng vay
            month = input.nextInt();
            double totalInterest = 0;
            for (int i = 0; i < month; i++) { // chạy vòng lặp for gán i = 0 , i sẽ là bé hơn month , tăng i lên một giá trị
                totalInterest = totalInterest + (money * (interestRate / 100) / 12 * month); // total = total + ( tiền * ( lại xuất chia cho 100 ) / 12 * tháng)
            }
            System.out.println(" Tổng số tiền lãi là : " + totalInterest); // in ra kết quả tổng tiền lãi
        }
    }
