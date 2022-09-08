package Validate_name_class;

public class Main {
    private static NameClass nameClass;

    public static final String[] validNameClass = new String[] {"C0318G","C0622G"};
    public static final String[] invalidNameClass = new String[] {" M0318G","P0323A"} ;
    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String name :validNameClass
             ) {
            boolean invalid = nameClass.validate(name);
            System.out.println(name + " Hợp lí hay không : " + invalid);
        }
        for (String name : invalidNameClass
             ) {
            boolean invalid = nameClass.validate(name);
            System.out.println(name + " Hợp lí hay không :" + invalid);
        }
    }
}
