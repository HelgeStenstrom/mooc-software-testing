package tudelft.chocolate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateBagsHelge {

    private ChocolateBags chocolateBags;

    @BeforeEach
    void setup() {
        chocolateBags = new ChocolateBags();
    }


    @ParameterizedTest(name = "ettor={0}, femmor={1}, total={2}, result={3}")
    @CsvSource({
            "1,1,5,0",
            "1,1,6,1",
            "1,1,7,-1",
            "1, 1, 8, -1"
    })
    void totalIsTooBig(int ones, int fives, int total, int expected) {
        int result = chocolateBags.calculateNeededOnes(ones, fives, total);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            // Three fives and two ones are needed for 17 in total. We have a surplus of ones or of fives
            "2, 30, 17, 2",
            "99, 3, 17, 2",
            // Too few ones
            "1, 30, 17, -1",
            // To few fives
            "2, 2, 17, -1",
            // Exactly the right amount
            "2, 3, 15, 0"
    })
    void needFivesAndOnes(int ones, int fives, int total, int expected) {
        // Setup and execute
        int result = chocolateBags.calculateNeededOnes(ones, fives, total);

        // Verify
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({
            // Three fives and two ones are needed for 17 in total. We have a surplus of ones or of fives
            "2, 30, 17, 2",
            "99, 3, 17, 2",
            // Too few ones
            "1, 30, 17, -1",
            // To few fives
            "2, 2, 17, -1",
            // Exactly the right amount
            "2, 3, 15, 0"
    })
    void mcFivesAndOnes(int ones, int fives, int total, int expected) {
        // Setup and execute
        int result = chocolateBags.calculateNeededOnes1(ones, fives, total);

        // Verify
        assertEquals(expected, result);
    }


}
