package demo_static;

class statics {
        // non-static phương thức method
         int multiply(int a, int b){
            return a * b;
        }

        // static phương thức method
        static int add(int a, int b){
            return a + b;
        }
    }

    public class Main {

        public static void main( String[] args ) {
            // tạo một thể hiện của lớp static
            statics st = new statics();

            // gọi phương thức non-static
            System.out.println(" 2 * 2 = " + st.multiply(2,2));

            // gọi phương thức static
            System.out.println(" 2 + 3 = " + statics.add(2,3));
        }
    }
