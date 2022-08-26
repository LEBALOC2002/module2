package search_for_absolute_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class absolute_number_calculatorTest {

    @Test
    void findAbsolute() {
        int number = 0;
        int expected = 0;

        int result = absolute_number_calculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = absolute_number_calculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = absolute_number_calculator.findAbsolute(number);
        assertEquals(expected, result);

    }

    public class AbsoluteNumberCalculator {
        public static int findAbsolute(int number) {
            if (number < 0)
                return -number;
            return number;
        }
    }
}