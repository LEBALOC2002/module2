package Classification_of_triangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class triangle_classifcationTest {

    @Test
    void checkTrangle() {
        int edge1 = 1;
        int edge2 = 1;
        int edge3 = 1;
        boolean result = triangle_classifcation.checkTrangle(edge1, edge2, edge3);
        assertTrue(result);
    }

    @Test
    void checkIsoscelesTriangle() {
        int edge1 = 1;
        int edge2 = 1;
        int edge3 = 1;
        boolean result = triangle_classifcation.checkIsoscelesTriangle(edge1, edge2, edge3);
        assertTrue(result);
    }

    @Test
    void checkEquilateralTriangle() {
        int edge1 = 1;
        int edge2 = 1;
        int edge3 = 1;
        boolean result = triangle_classifcation.checkEquilateralTriangle(edge1, edge2, edge3);
        assertTrue(result);
    }

    @Test
    void checkRightTriangle() {
        int edge1 = 1;
        int edge2 = 21;
        int edge3 = 21;
        boolean result = triangle_classifcation.checkRightTriangle(edge1, edge2, edge3);
        assertTrue(result);
    }

    @Test
    void triangleClassification() {
        int edge1 = 1;
        int edge2 = 1;
        int edge3 = 1;
        String result = triangle_classifcation.triangleClassification(edge1, edge2, edge3);
        assertTrue(Boolean.parseBoolean(result));
    }
}