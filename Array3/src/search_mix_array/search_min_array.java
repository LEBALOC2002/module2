package search_mix_array;

import java.util.Scanner;

public class search_min_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cho nhập giá trị

        System.out.print("Nhap vao so luong phan tu: n = ");// nhập vào độ dài muốn chứa của mảng
        int n = scanner.nextInt(); // in ra kết quả đã nhập

        int[] a = new int[n]; // khai báo kiểu in và khởi tạo mảng mới là a bằng với tham chiếu kiểu int mảng n

        System.out.println("Nhap vao mang cac so nguyen:"); // nhập các số nguyên tố
        for (int i = 0; i < n; i++) {
            System.out.print("\tPhan tu thu " + (i + 1) + " la: "); // nhập các giá trị thứ tự từ (i + 1 )
            a[i] = scanner.nextInt(); // trả lại dự liệu các thứ tự của mảng
        }

        System.out.println("Mang vua nhap la:");  // in ra các dự liệu vừa nhập theo thứ tự của mảng
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t"); // in ra kết quả các thứ tự của  mảng đã nhập
        }

        int min = a[0]; // khai báo kiểu int gán giá trị min bằng với vị trị đầu tiên của mảng
        for (int i = 1; i < n; i++) { // chạy vòng lặp so sánh min hiện tại và các giá trị tiếp theo trong mảng
            if (min > a[i]) { // nếu min lớn hơn các độ dài trong mảng
                min = a[i]; // min bằng với số nhỏ nhất trong mảng
            }
        }

        System.out.println("\nPhan tu nho nhat cua mang la:" + min); // in ra kết quả nhỏ nhất  trong mảng

        scanner.close();
    }
}
