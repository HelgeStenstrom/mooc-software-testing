package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher = new CaesarShiftCipher();

    @Test
    void noShift() {

        String result = cipher.caesarShiftCipher("abc", 0);

        assertEquals("abc", result);
    }

    @Test
    void shiftByOne() {

        String result = cipher.caesarShiftCipher("abc", 1);

        assertEquals("bcd", result);
    }

    @ParameterizedTest
    @CsvSource({
            "'a', 0, 'a'",
            "'abc', 0, 'abc'",
            "'', 0, ''",
            "'a', 1, 'b'",
            "'ab', 1, 'bc'",
            "'z', 1, 'a'",
            "'yza', 1, 'zab'",
            "'zab', -1, 'yza'",
            "'b', 26, 'b'",
            "'a', 27, 'b'",
            "'ba', -1, 'az'",
    })
    void someStrings(String string, int shift, String expected) {
        assertEquals(expected, cipher.caesarShiftCipher(string, shift));

    }
}
