package Classification_of_triangles;

import java.util.Scanner;

public class triangle_classifcation {
    public static boolean checkTrangle(int edge1, int edge2, int edge3) {
        boolean isTrangle;
        isTrangle = edge1 > 0
                && edge2 > 0
                && edge3 > 0
                && (edge1 + edge2) > edge3
                && (edge2 + edge3) > edge1
                && (edge1 + edge3) > edge2;
        return isTrangle;
    }

    public static boolean checkIsoscelesTriangle(int edge1, int edge2, int edge3) {
        boolean isIsoscelesTriangle;
        isIsoscelesTriangle = edge1 == edge2 || edge2 == edge3 || edge1 == edge3;
        return isIsoscelesTriangle;
    }

    public static boolean checkEquilateralTriangle(int edge1, int edge2, int edge3) {
        boolean isEquilateralTriangle;
        isEquilateralTriangle = edge1 == edge2 && edge2 == edge3;
        return isEquilateralTriangle;
    }

    public static boolean checkRightTriangle(int edge1, int edge2, int edge3) {
        boolean isRightTriangle;
        isRightTriangle = edge1 * edge1 + edge2 * edge2 == edge3 * edge3
                || edge1 * edge1 + edge3 * edge3 == edge2 * edge2
                || edge2 * edge2 + edge3 * edge3 == edge1 * edge1;
        return isRightTriangle;
    }

    public static String triangleClassification(int edge1, int edge2, int edge3) {
        String triangleClassification;
        if (checkTrangle(edge1, edge2, edge3)) {
            if (checkIsoscelesTriangle(edge1, edge2, edge3)) {
                triangleClassification = "Tam giác cân";
            } else if (checkEquilateralTriangle(edge1, edge2, edge3)) {
                triangleClassification = "Tam giác đều";
            } else if (checkRightTriangle(edge1, edge2, edge3)) {
                triangleClassification = "Tam giác vuông";
            } else {
                triangleClassification = "tam giác thươnng";
            }
        } else {
            triangleClassification = "không phải là tam giác";
        }
        return triangleClassification;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the long side first: ");
        int edge1 = sc.nextInt();

        System.out.println("Enter the length of the second side: ");
        int edge2 = sc.nextInt();

        System.out.println("Enter the length of the third side: ");
        int edge3 = sc.nextInt();

        String result = triangleClassification (edge1, edge2, edge3);
        System.out.println("Kết quả: " + result);
    }
}

