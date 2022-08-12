package reverse;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size; // khai báo kiểu int gán biến size
        int[] array; // khai báo biến int , khởi tạo mảng mới
        Scanner scanner = new Scanner(System.in); // in ra ô nhập giá trị trong mảng là bao nhiêu
        do {
            System.out.println("nhập size"); // in ra kết quả
            size = scanner.nextInt(); // kết quả size sẽ đc in ra
            if (size < 20) // nếu size bé hơn 20
                System.out.println("Kích thước không vượt quá 20"); // in ra kết quả kích thước k đc giới hạn 20

        }
        while (size > 20); // trong khi size lớn hơn 20
        array = new int[size]; // mảng array sẽ taọ mới kiểu int và hàm chưa size
        int i = 0; // khai báo  kiểu int gán giá trị i = 0
        while (i < array.length) {  // trong khi i bé hơn độ dài của mảng
            System.out.println("Nhập phần tử" + (i + 1) + " : "); // in ra nhập phân tử của i cộng với 1
            array[i] = scanner.nextInt(); // và in ra kết quả mảng i
            i++;
        }
        System.out.printf("%-30s","Các phần tử trong mảng: ");  // in ra giá trị trong mảng khoảng cách bên trái là 30
        for (int j = 0; j < array.length; j++) { // dùng vòng lặp for j bằng 0 ; j bé hơn độ dài của mảng ; j tăng lên một giá trị
            System.out.printf("%-5s",array[j]); //in ra giá trị khoảng cách bên trái là 5
        }
        for (int j = 0; j < array.length / 2; j++) { // chạy j bằng o ; j bé hơn độ dài mảng chia 2 ; tăng lên 1 giá trị
            int temp = array[j]; //khai báo gán giá trị temp bằng array trong mảng i
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-30s","Mảng đảo ngược:");  // in ra giá trị trong mảng khoảng cách bên trái là 30
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%-5s",array[j]); //in ra giá trị khoảng cách bên trái là 5
        }
    }
}
