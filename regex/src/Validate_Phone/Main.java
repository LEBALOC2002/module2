package Validate_Phone;

public class Main {
    private static TelephoneExample telephoneExample;
    public static final String[] validTelephone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidTelephone = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        TelephoneExample telephoneExample = new TelephoneExample();
        for (String number : validTelephone) {
            if (telephoneExample.validate(number)) {
                System.out.println(number + " is number phone");
            } else {
                System.out.println(number + " is not number phone");
            }
        }
        for (String number : invalidTelephone
        ) {
            if (telephoneExample.validate(number)) {
                System.out.println(" number + is number phone ");
            } else {
                System.out.println(number + " is not number phone ");
            }
        }
    }
}
