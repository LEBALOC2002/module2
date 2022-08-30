package baitap4;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(20, 4);
        list.remove(0);
        System.out.println(list);

        if (list.contains(4)) {
            System.out.println("Yes!");
        } else System.out.println("NO!");
        if (list.contains(5)) {
            System.out.println("Yes!");
        } else System.out.println("NO!");
    }
}


