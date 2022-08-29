package baitap3;

public class Main {
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

        MyList<Number> listNumber = new MyList<>(7);
        listNumber.add(0, 1);
        listNumber.add(1, 2);
        listNumber.add(2, 3);
        listNumber.add(3, 4);
        listNumber.add(4, 5);
        listNumber.add(5, 6);
        listNumber.add(6, 7);
        listNumber.add(20, 8);
        listNumber.printMyList();
        System.out.println(listNumber.get(4));
        if (listNumber.contains(5)) {
            System.out.println("Yes!");
        } else System.out.println("NO!");
        if (listNumber.contains(5)) {
            System.out.println("Yes!");
        } else System.out.println("NO!");
    }
}

