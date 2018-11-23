package tudelft.sum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumbersSumTest {

    @Test
    void test() {
        // Setup
        final ArrayList<Integer> n12 = new ArrayList<>(Arrays.asList(1, 2));
        final ArrayList<Integer> n24 = new ArrayList<>(Arrays.asList(2, 4));
        final ArrayList<Integer> n47 = new ArrayList<>(Arrays.asList(4, 7));
        final ArrayList<Integer> n99 = new ArrayList<>(Arrays.asList(9, 7));
        final ArrayList<Integer> n59 = new ArrayList<>(Arrays.asList(5, 9));

        final TwoNumbersSum adder = new TwoNumbersSum();

        // Exercise

        // Verify
        assertEquals(n24, adder.addTwoNumbers(n12, n12));
        assertEquals(n59, adder.addTwoNumbers(n12, n47));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1,  1, 1,   2, 2",
            "1, 1,  1, 2,   2, 3",
            "1, 2,  1, 1,   2, 3",
            "1, 2,  1, 2,   2, 4",
            "4, 4,  4, 6,   9, 0",
            "4, 0,  1, 1,   5, 1",
           // "8, 9,  1, 1,   0, 0",
    })
    void test2(int a1, int a2, int b1, int b2, int s1, int s2) {
        // Setup
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(a1, a2));
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(b1, b2));
        final ArrayList<Integer> expexcted = new ArrayList<>(Arrays.asList(s1, s2));

        final TwoNumbersSum adder = new TwoNumbersSum();

        // Exercise

        // Verify
        assertEquals(expexcted, adder.addTwoNumbers(a, b));
    }

    // TODO: test with 3-digit results
    // TODO: find the bug

    @ParameterizedTest
    @CsvSource({
            "8, 9,  1, 1,   1, 0, 0",
    })
    void test3(int a1, int a2, int b1, int b2, int s1, int s2, int s3) {
        // Setup
        final ArrayList<Integer> a = new ArrayList<>(Arrays.asList(a1, a2));
        final ArrayList<Integer> b = new ArrayList<>(Arrays.asList(b1, b2));
        final ArrayList<Integer> expexcted = new ArrayList<>(Arrays.asList(s1, s2, s3));

        final TwoNumbersSum adder = new TwoNumbersSum();

        // Exercise

        // Verify
        assertEquals(expexcted, adder.addTwoNumbers(a, b));
    }
}
