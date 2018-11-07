package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    private void expect(int expected, String string) {
        int result = roman.convert(string);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void manyTests() {
        expect(4, "IIII");
        expect( 6, "VI");
    }

    @Test
    void shouldThrowError() {
        // Setup
        String badValue = "123";

        // Exercise and verify
        Assertions.assertThrows(NullPointerException.class, () -> roman.convert(badValue));
    }


    @Test
    void thisTestWillFail() {
        // Setup
        String badValue = "123";

        // Exercise and verify
        Assertions.assertThrows(IllegalAccessException.class, () -> roman.convert(badValue));
    }
}
