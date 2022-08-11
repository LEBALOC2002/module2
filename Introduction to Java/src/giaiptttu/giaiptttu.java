package giaiptttu;

import java.util.Scanner;

import static java.lang.System.*;

public class giaiptttu {
    public static void main(String[] args) {
        out.println("Linear Equation Resolver");
        out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(in);
        out.print("a: ");
        double a = scanner.nextDouble();

        out.print("b: ");
        double b = scanner.nextDouble();

        out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                out.print("The solution is all x!");
            } else {
                out.print("No solution!");
            }
        }
    }
}

