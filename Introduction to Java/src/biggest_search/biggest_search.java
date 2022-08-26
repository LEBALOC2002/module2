package biggest_search;

import java.util.Scanner;
public class biggest_search {
    public static void main(String[] args) {
        int[] numberArr = {1, 10, 30, 2, 71, 7, 9, 51, 3, 5}; //cho các giá trị vào trong mảng
        int max = numberArr[0]; // gắn max là  bằng index đầu tiên  của mảng
        System.out.println("Các phần tử trong mảng là: "); //  in ra các phần tử trong mảng
        for (int i : numberArr) { //i lấy các giá trị bên trong của mảng
            System.out.print(i + ", "); // in ra từng giá trị của mảng và giữ khoảng cách
        }
        for (int num : numberArr) { //num lấy các giá trị bên trong cuả mảng
            if (max < num) //nếu số lớn nhất đc gắn bé hơn num
                max = num; // thì max gán lại số num
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %d\n", max); // in ra mảng số max đc gắng lớn nhất

        for (int k : numberArr) { //k gán cho number
            boolean check = true; // khai báo biến gán giá trị check là bằng true
            if (k >= 2) { // nếu k lớn hơn hoặc bằng 2
                for (int j = 2; j < k; j++) { //chạy vòng lặp j = 2 ,  j bé hơn k , tăng lên một giá trị
                    if (k % j == 0) { // nếu k chia phần trăm j bằng 0
                        check = false; // thì là false
                        break; // dừng vòng lặp
                    }
                }
                if (check) { // nếu check mà true
                    System.out.print(k + " ");
                    //in ra giá trị
                }
            }
        }

    }
}





