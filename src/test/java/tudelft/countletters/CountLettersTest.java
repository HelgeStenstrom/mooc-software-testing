package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountLettersTest {

    @Test
    void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }


    @Test
    void multipleMatchingWordsR() {
        int words = new CountLetters().count("catr|dogr");
        Assertions.assertEquals(2, words);
    }

    @Test
    void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    void firstWordDoesNotMatch() {
        int words = new CountLetters().count("cat|dogr");
        Assertions.assertEquals(1, words);
    }

}