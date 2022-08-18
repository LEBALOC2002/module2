package static_method;

public class static_method_bt {
        private int rollno ;
        private String name ;
        private static String collge = "BBDIT";
        static_method_bt (int r , String n){
            rollno = r;
            name = n ;
        }
        static void chang(){
            collge = "CODEGYM";
        }
        void display () {
            System.out.println(rollno + "" + name + "" + collge);
        }

    }

