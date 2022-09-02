package BAITAP3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class reverseIntergerStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số  lượng phần tử: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element[" + i + "]");
            array[i] = input.nextInt();
            stack.push(array[i]);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
