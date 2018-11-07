package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChocolateBagsBeforeBoundaryTest {
    @Test
    void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculateNeededOnes(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void onlyBigBars() {
        int result = new ChocolateBags().calculateNeededOnes(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    void bigAndSmallBars() {
        int result = new ChocolateBags().calculateNeededOnes(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    void onlySmallBars() {
        int result = new ChocolateBags().calculateNeededOnes(4, 2, 3);
        Assertions.assertEquals(3, result);
    }
}
