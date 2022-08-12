package tim_gia_tri_trong_mang;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        // khởi tạo mảng mới và cho giá trị cùng với kiểu dữ liệu String
        String[] Students = {"Lê Bá Lộc", "Hoàng Đức Khanh", "Trần Hải Bình", "Nguyễn Hà", "Trần Quốc Hướng", "tài smile"};
        Scanner scanner = new Scanner(System.in); // ô cho nhập dữ liệu
        System.out.println("nhập tên  "); // in kết quả của ô nhập dữ liệu
        String input_name = scanner.nextLine(); // kêt quả đc in ra bằng next line vì là chữ
        boolean isExit = false; // cho kiểu dữ liệu và gán isExit
        for (int i = 0; i < Students.length; i++) { //i = 0 ; i bé hơn độ dài của mảng students
            if (Students[i].equals(input_name)) { // nếu hàm student của vị trí trong mảng
                //in ra giá trị kết quả input name + i
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                boolean isExist = true; // giá trị isExist = true
                break;

            }
        }
        if (!isExit) // nếu khác Exit thì
            // in ra giá trị không phải có trong tên bạn tìm
            System.out.println("Not found" + input_name + " in the list.");
    }
}








