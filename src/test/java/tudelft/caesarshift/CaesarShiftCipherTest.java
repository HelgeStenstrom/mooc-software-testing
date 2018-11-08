package tudelft.caesarshift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarShiftCipherTest {

    CaesarShiftCipher cipher = new CaesarShiftCipher();

    @Test
    void noShift() {

        String result = cipher.CaesarShiftCipher("abc", 0);

        assertEquals("abc", result);
    }

    @Test
    void shiftByOne() {

        String result = cipher.CaesarShiftCipher("abc", 1);

        assertEquals("bcd", result);
    }

    @ParameterizedTest
    @CsvSource({
            "'', 0, '",
    })
    void someStrings(String string, int shift, String expected) {
        

    }
}
