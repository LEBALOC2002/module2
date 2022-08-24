package Bai_tap_13;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Certificate> array = new LinkedList<>();
        array.add(new Certificate(1,"LOC", "A","1/1/2000")) ;
        array.add(new Certificate(2, "KHANH", "B ","12/11/2000")) ;
        Employee Env1  = new Experience(1 , " nguyen truong to " , 2000 , 999999999,
                "nguyenloc@gmail.com",1,array, 10 , "A"  ) ;
        System.out.println(Env1.toString());
        System.out.println(Employee.getEmployee_count());
        Employee Evn2 = new Fresher (1 , "bình" ,"13/1/1900" , 123123123 , "nguyenbinh@gmail.com " ,1 , 2 ,  "a", array ) ;
        System.out.println(Evn2.toString());
        System.out.println(Employee.getEmployee_count());
        Employee Evn3 = new Intern( 1 , "tien " , "12/211/512" ,21321323 , "adsasd1@gmail.com" , 1 , 1, "a " ,  "lá",  array );
        System.out.println(Evn2.toString());
        System.out.println(Employee.getEmployee_count());
    }
}
