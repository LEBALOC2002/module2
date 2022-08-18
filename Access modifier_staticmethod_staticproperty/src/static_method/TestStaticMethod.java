package static_method;

public class TestStaticMethod {
    public static void main(String args[]) {
        static_method_bt.chang(); //calling change method

        //creating objects
        static_method_bt s1 = new static_method_bt(111, "Hoang");
        static_method_bt s2 = new static_method_bt(222, "Khanh");
        static_method_bt s3 = new static_method_bt(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}


