import static org.junit.Assert.*;

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
    



    

    // TODO: Make tests for each problem you solve
    
}


