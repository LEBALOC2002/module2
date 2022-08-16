package Selection_sort;

public class Selection_sort {
    public static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) { // chạy vòng lặp xem số nào nhỏ nhất
            int min = i; // gán số nhỏ nhất đã tìm ra trong vòng lặp
            for (int j = i + 1; j < numbers.length; j++) // lấy j bằng với vị trí thứ nhất của mảng cộng 1 ; j bé hn độ dài của mảng ; j tăng  lên 1 giá trị
                if (numbers[j] < numbers[min]) // nếu mảng j bé hơn min
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) { // nếu min khác bằng i
                int temp = numbers[min]; // khai báo biến int gán temp bằng min hiện tại
                numbers[min] = numbers[i]; // mảng min = mảng j
                numbers[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 123, 1, 312, 12, 312, 23, 122};
        selectionSort(numbers);
        for(int element:numbers){
            System.out.print(element+ " ");
        }
        System.out.println();
        System.out.println("ta là lộc sa đao");
    }
}
