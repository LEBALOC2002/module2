package tim_so_nho_nhat_trong_mang;

public class tim_so_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 2, 6, 9}; // khai báo kiểu int và mảng mới giá  trị của mảng là arr
        int index = minValue(arr); // khai báo kiểu int bằng giá trị index bằng mảng mới tên là minValue
        System.out.println("The smallest element in the array is: " + arr[index]); // in ra giá trị + ví trí trong mảng
    }

    public static int minValue(int[] array) { // tham chiếu
        int index = 0;  // khai báo in gán giá trị là index = 0
        for (int i = 1; i < array.length; i++) { // chạy vòng lặp khai báo kiểu int gán i = 1 ; i bé hơn độ dài của mảng , tăng lên một giá trị
            if (array[i] < array[index]) {  // nếu mảng i bé hơn mảng index
                index = i;  // index = 1
            }
        }
        return index; // trả về kết quả index
    }
}

