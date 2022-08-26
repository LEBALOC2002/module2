package getter_setter;

public class main {
    public static void main(String[] args) {
        person bt = new person(-25, "Lộc sa do", true);
        System.out.println("Tôi tên là  " + bt.getName());
        System.out.println("Tuổi " + bt.getAge());
        System.out.println("Giới tính " + bt.isGender());
    }
}
