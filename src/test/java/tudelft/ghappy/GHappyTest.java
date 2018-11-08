package tudelft.ghappy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GHappyTest {

    GHappy gh = new GHappy();

    @ParameterizedTest
    @CsvSource({
            "'abc', true",
            "'ag', false",
            "'agg', true",
            "'g', false",
            "'gg', true",
            "'ga', false",
            "'gag', false",
            "'gagga', false",
            "'g', false",
            "'aagag', false"
    })
    void one(String string, boolean expected) {
        // Setup
//        final String expected = "ab";
//        final String string = "abXYZba";
        final boolean actual = gh.gHappy1(string);
        assertEquals(expected, actual);
    }
}
