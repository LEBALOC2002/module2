package Checking_for_primes;

import java.util.Scanner;

public class Checking_for_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập số bạn muốn nhập :");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " Không phải số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " Là số nguyên tố");
            else
                System.out.println(number + " Không phải số nguyên tố ");
        }
    }
}

