package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumeralTest {


    @Test
    void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    void numberFourOnAWatch() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IIII");
        Assertions.assertEquals(4, result);
    }

    @Test
    void number3LowerCase() {
        // Setup
        RomanNumeral roman = new RomanNumeral();

        // Exercise
        int result = roman.convert("iii");

        // Verify
        Assertions.assertEquals(3, result);
    }
}
