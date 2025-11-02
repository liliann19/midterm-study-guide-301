import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

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

    @Test
    void testCountWordsBetweenLengths() {
        HashSet<String> words = new HashSet<>();
        words.add("apple");
        words.add("banana");
        words.add("fig");
        words.add("pear");
        int actual = Practice.countWordsBetweenLengths(words, 2, 5);
        assertEquals(2,actual);
    }

    @Test
    void testCountWordsBetweenLengthsEmptySet() {
        HashSet<String> words = new HashSet<>();
        int actual = Practice.countWordsBetweenLengths(words, 2, 5);
        assertEquals(0, actual);
    }

    @Test
    void testCountWordsBetweenLengthsAllMatch() {
        HashSet<String> words = new HashSet<>();
        words.add("pear");
        words.add("fig");
        words.add("plum");
        int actual = Practice.countWordsBetweenLengths(words, 2, 5);
        assertEquals(3, actual);
    }

    @Test
    void testDiffBetweenOddEven() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 3);
        numbers.put(3, 4);
        numbers.put(4, 5);
        // odd -> 2 even -> 2 
        // 2 - 2 = 0
        int actual = Practice.diffBetweenOddEven(numbers);
        assertEquals(0, actual);
    }

    @Test
    void testDiffBetweenOddEvenAllEven() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 4);
        numbers.put(3, 6);
        // odd -> 0 even -> 3 
        // 0 - 3 = -3
        int actual = Practice.diffBetweenOddEven(numbers);
        assertEquals(-3, actual);
    }

    @Test
    void testDiffBetweenOddEvenAllOdd() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 1);
        numbers.put(2, 3);
        numbers.put(3, 5);
        // odd -> 3 even -> 0 
        // 3 - 0 = 3
        int actual = Practice.diffBetweenOddEven(numbers);
        assertEquals(3, actual);
    }


}


