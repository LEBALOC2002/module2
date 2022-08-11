package Showhello;

import java.util.Scanner;

public class Showhello {
    public static void main(String[] args) {
        System.out.println("Nhập tên của bạn");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name);
    }
}