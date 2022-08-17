package xay_dung_lop_fan;

public class main {
    public static void main(String[] args) {
        fan fan = new fan();
        System.out.println(fan.toString());

        fan fan1 = new fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        fan fan2 = new fan();
        fan2.setSpeed(fan1.getMEDIUM());
        System.out.println(fan2.toString());
    }
}
