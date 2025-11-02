import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PracticeTest {
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffOneNum() {
        int[] numbers = {8};
        int actual = Practice.maxDiff(numbers);
        assertEquals(0, actual);
    }

    @Test
    void testMaxDiffAllNegative() {
        int[] numbers = {-8, -2, -9, -5};
        int actual = Practice.maxDiff(numbers);
        assertEquals(7, actual);
    }

    @Test
    void testLongStringSpecificCharWithSameLetter() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apricot");
        words.add("banana");
        words.add("cherry");
        String actual = Practice.longStringSpecificChar(words, "a");
        assertEquals("apricot", actual);
    }

    @Test
    void testLongStringSpecificCharWithCapital() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apricot");
        words.add("banana");
        words.add("Cherry");
        String actual = Practice.longStringSpecificChar(words, "c");
        assertEquals("cherry", actual);
    }

    @Test
    void testLongStringSpecificCharNoMatch() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apricot");
        words.add("banana");
        words.add("Cherry");
        String actual = Practice.longStringSpecificChar(words, "d");
        assertEquals("", actual);
    }



    


}


