import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = nums[0]; 
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
            if (nums[i] > max ) {
                max = nums[i];
            }
        }
        return max - min;
    }

    public static String longStringSpecificChar(ArrayList<String> words, String letter) {
        String currentLongWord = "";
        int currentLength = 0;

        for (String word : words){
            if (word.toLowerCase().startsWith(letter.toLowerCase())) {
                if(word.length() > currentLength) {
                    currentLength = word.length();
                    currentLongWord = word;
                }
            }
        }
        return currentLongWord.toLowerCase();
    }

    public static int countWordsBetweenLengths(HashSet<String> words, int n, int m) {
        int count = 0;

        for (String word : words) {
            int wordLength = word.length();
            if (wordLength > n && wordLength < m){
                count ++;
            }
        }
        return count;
    }

    public static int diffBetweenOddEven(HashMap<Integer, Integer> numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers.values()) {
            if (num % 2 == 0) {
                evenCount ++;
            }
            if (num % 2 != 0) {
                oddCount ++;
            }
        }
        return oddCount - evenCount;
    }

    public static int findSecondLargestNum(HashMap<Integer, Integer> numbers){
        int secondLarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;

        for (int num : numbers.keySet()){
            if (num > large) {
                secondLarge = large;
                large = num;
            }
            else if (num > secondLarge && num < large){
                secondLarge = num;
            }
        }
        return secondLarge;
    }
}