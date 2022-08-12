package hien_thi_20_so_dau_tien;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_dau_tien {
    public static void main(String[] args) {
        int n; // khai báo kiểu int gán giá trị là n
        int status = 1; //khai báo kiểu int gán giá trị status = 1
        int num = 3; // khai báo kiểu int gán giá trị num = 3
        Scanner scanner = new Scanner(System.in); //  ô nhập
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");  // in ra kết quả
        n = scanner.nextInt(); // n bằng kết quả in ra
        if (n >= 1) { // nếu n mà bé hơn hoặc bằng 1
            System.out.println(n + " Số nguyên tố đầu tiên là:"); // in ra kết quả n là số nguyên tố đâu tiên
            System.out.println(2); // và in ra kết quả thứ 2
        }
        for (int i = 2; i <= n; ) {  // tiếp tục chạy vòng lặp cho i bằng 2 , i bé hơn hoặc bằng n
            for (int j = 2; j <= Math.sqrt(num); j++) { // chạy j = 2 ; j bé hơn hoặc bằng căn bậc 2 của num , tăng lên 1 giá trị
                if (num % j == 0) { // nếu num mà chia phần trăm cho j == 0
                    status = 0; // thì status = 0
                    break; // dừng vòng lặp
                }
            }
            if (status != 0) { // nếu status khác bằng 0
                System.out.println(num); //in ra num
                i++; // tăng lên 1 giá trị
            }
            status = 1; //status = 1
            num++; // tăng lên 1 giá trị
        }
    }
}
