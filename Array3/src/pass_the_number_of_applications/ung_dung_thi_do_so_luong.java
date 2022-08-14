package pass_the_number_of_applications;

import java.util.Scanner;

public class ung_dung_thi_do_so_luong {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            int count = 0;
            System.out.print("List of mark: ");
            for (int k : array) {
                System.out.print(k + "\t");
                if (k >= 5 && k <= 10)
                    count++;
            }
            System.out.print("\n The number of students passing the exam is " + count);
        }
    }
}
