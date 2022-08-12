package search_max_array;

import java.util.Scanner;

public class search_max_array {
    public static void main(String[] args) {
        int size; // khai báo kiểu in gán giá trị là size
        int[] array; // khai báo kiểu in ra mảng mới
        Scanner scanner = new Scanner(System.in); // ô nhập
        do {  // làm
            System.out.print("Enter a size:"); // nhập size
            size = scanner.nextInt(); // in ra giá trị của size
            if (size > 20) // nếu size lớn hơn 20
                System.out.println("Size should not exceed 20"); // in ra giá trị size không quá 20
        } while (size > 20); // trong khi đó size lớn hơn 20
        array = new int[size]; // array bằng khai báo kiểu in mới size
        int i = 0; // khai báo kiểu in gán giá trị i = 0
        while (i < array.length) { // trong khi i bé hơn độ dài của mảng
            System.out.print("Enter element" + (i + 1) + " : "); // in ra kết quả cộng (i +1 ) cộng với khoảng trắng
            array[i] = scanner.nextInt(); // in ra kết quả của i khi tìm giá trị của max
            i++;
        }
        System.out.print("Property list: "); // in ra giá trị
        for (int j = 0; j < array.length; j++) {// j bằng 0 , j bé hơn độ dài của mảng , j tăng lên một giá trị
            System.out.print(array[j] + "\t"); // in ra mảng j
        }
        int max = array[0]; // khai báo kiểu dữ liệu là int gán giá trị là max = mảng vị trí 0
        int index = 1; // khai báo biến i index (vị trí) = 1
        for (int j = 0; j < array.length; j++) { // j = 0 ; j bé hơn độ dài của mảng , tâng lên một giá trị
            if (array[j] > max) { // nếu mảng vị trí j lớn hơn max
                max = array[j]; // thì max sẽ bằng với mảng i
                index = j + 1; // vị trí bằng với j + 1
            }
        }
        // in ra giá trị của max và vị trí của max đang đứng
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}