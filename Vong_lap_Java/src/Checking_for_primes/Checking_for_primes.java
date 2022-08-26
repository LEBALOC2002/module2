package Checking_for_primes;

import java.util.Scanner;

public class Checking_for_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập số bạn muốn nhập :"); // in ra số muốn nhập
        int number = scanner.nextInt();
        if (number < 2) { //nếu number bé hơn 2
            System.out.println(number + " Không phải số nguyên tố"); // thì in ra không phải là số nguyên tố
        } else { // ngược lại
            int i = 2;
            boolean check = true; // i = 2  boolean gán giá trị check = true
            while (i <= Math.sqrt(number)) { // trong khi i = 2 bé hơn  hoặc bằng căn bật 2 của số đã nhập
                if (number % i == 0) { // nếu số nhập chia hết cho i == 0 thì gán giá trị check là false
                    check = false;
                    break; // dừng lại vòng lặp
                }
                i++; // tăng lên 1 giá trị
            }
            if (check) // nếu giá trị check một là nguyên tố
                System.out.println(number + " Là số nguyên tố");
            else
                // nếu không phải số nguyên tố thì còn lại
                System.out.println(number + " Không phải số nguyên tố ");
        }
    }
}

