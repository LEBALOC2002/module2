package demo_static;

class statictest {
        // non-static phương thức method
         int multiply(int a, int b){
            return a * b;
        }

        // static method
        static int add(int a, int b){
            return a + b;
        }
    }

    public class Main {

        public static void main( String[] args ) {

            // create an instance of the StaticTest class
            statictest st = new statictest();

            // call the nonstatic method
            System.out.println(" 2 * 2 = " + st.multiply(2,2));

            // call the static method
            System.out.println(" 2 + 3 = " + statictest.add(2,3));
        }
    }
