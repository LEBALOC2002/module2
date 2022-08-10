package UCLN;

public class UCLN {
    public static void main(String[] args) {
        int num1 = 20, num2 = 15 , ucln = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                ucln = i;
        }
        System.out.printf("Ước chung lớn nhất của %d và %d là: %d", num1, num2, ucln);
    }
}

