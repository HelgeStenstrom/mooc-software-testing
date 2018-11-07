package tudelft.mirror;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MirrorTest {

    Mirror mirror = new Mirror();

    @ParameterizedTest
    @CsvSource({
            "'abXYZba', 'ab'",
            "'abca', 'a'",
            "'aba', 'aba'",
            "'abcxba', 'ab'",
            "'abca', 'a'",
            "'aabbcc', ''",
            "'aaabaa', 'aa'",
            "'abaaa', 'a'",
            "'abcabcabcbaba', 'ab'",
            "'abaaa', 'a'",
            "'aaaaba', 'a'",
            "'', ''",
            "'', ''",
            "'', ''",
            "'', ''"
    })
    void one(String string, String expected) {
        // Setup
//        final String expected = "ab";
//        final String string = "abXYZba";
        final String actual = mirror.mirrorEnds(string);
        assertEquals(expected, actual);
    }
}
