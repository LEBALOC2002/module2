package baitap3;

public class TestMyList {
    // tạo lớp TestLinkedList chứa hàm main, tạo đối tượng Mylinked list ,
    // gọi addFirst(), add(), print() chạy ứng dụng
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyList myLinkedList = new MyList(14) ;
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4,9 );
        myLinkedList.add(33 , 10  );
        myLinkedList.printList();
    }
}