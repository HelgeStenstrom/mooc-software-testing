package tudelft.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
    void leapYearsThatAreNonCenturialYears() {
        LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        assertTrue(result);
    }

    @Test
    void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        assertTrue(ly.isLeapYear(2000));
    }

    @Test
    void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        assertFalse(ly.isLeapYear(1500));
    }

    @Test
    void nonLeapYears() {
        LeapYear ly = new LeapYear();
        assertFalse(ly.isLeapYear(2017));
    }
}
