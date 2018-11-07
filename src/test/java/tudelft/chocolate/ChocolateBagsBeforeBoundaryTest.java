package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChocolateBagsBeforeBoundaryTest {

    private ChocolateBags chocolateBags;

    @BeforeEach
    void setup() {
        chocolateBags = new ChocolateBags();
    }


    @Test
    void totalIsBiggerThanAmountOfBars() {
        int result = chocolateBags.calculateNeededOnes(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void onlyBigBars() {
        int result = chocolateBags.calculateNeededOnes(500, 30, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    void bigAndSmallBars() {
        int result = chocolateBags.calculateNeededOnes(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    void onlySmallBars() {
        int result = chocolateBags.calculateNeededOnes(4, 2, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    void onlySmallBarsAgain() {
        Assertions.assertEquals(3, chocolateBags.calculateNeededOnes(1000, 0, 3));
    }
}
