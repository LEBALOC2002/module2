package Calculation_of_body_mass_index;

import java.util.Scanner;

public class Calculation_body {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double higth, weight, bmi;
        System.out.println("Cân nặng của bạn (tính bằng kilogam):");
        higth = scanner.nextDouble(); // nhập cân nặng
        System.out.println("Chiều cao của bạn (tính bằng centimet):");
        weight = scanner.nextDouble(); // nhập chiều cao
        bmi = weight / Math.pow(higth, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18.5)
            System.out.printf("%-20.2s%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2s%s", bmi, "Normal");
        else if (bmi < 30.5)
            System.out.printf("%-20.2s%s", bmi, "overweight");
        else
            System.out.printf("%-20.2s%s", bmi, "obese");
    }
}
