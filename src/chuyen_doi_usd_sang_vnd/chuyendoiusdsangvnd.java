package chuyen_doi_usd_sang_vnd;

import java.util.Scanner;

public class chuyendoiusdsangvnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng usd");
        int usd = scanner.nextInt();
        int rate = 23000 * usd;
        System.out.printf("giá của bạn là sau khi đổi là %d vnđ", rate);
    }

}

