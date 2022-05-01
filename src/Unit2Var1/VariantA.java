package Unit2Var1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class VariantA {
    private int longestLen = 0;
    private int longest = 0;
    private int smallestLen = Integer.MAX_VALUE;
    private int smallest = 0;
    public VariantA(int @NotNull [] numbers){
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            temp = Integer.toString(numbers[i]).length();
            if (temp > longestLen){
                longestLen = temp;
                longest = numbers[i];
            }
            if(temp < smallestLen){
                smallestLen = temp;
                smallest = numbers[i];
            }
        }
    }

    public int findLenOfNumber(int number){
        return Integer.toString(number).length();
    }

    public int findNotUniqueNumber(int[] numbers){
        int result = 0;
        int maxCount = 0;
        int count = 0;
        int[] unique = new int[10];
        String numberString = "";
        for (int i = 0; i < numbers.length; i++) {
            numberString = Integer.toString(Math.abs(numbers[i]));
            for (char ch: numberString.toCharArray()) {
                unique[Character.getNumericValue(ch)] += 1;
            }
            count = findMaxValue(unique);
            if (count > maxCount){
                maxCount = count;
                result = numbers[i];
            }
            cleanIntArray(unique);
        }
        return result;
    }

    public int findMaxValue(int[] array){
        int maxVal = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxVal < array[i]){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
    public void cleanIntArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public int getLongestLen() {
        return longestLen;
    }

    public int getLongest() {
        return longest;
    }

    public int getSmallestLen() {
        return smallestLen;
    }

    public int getSmallest() {
        return smallest;
    }


}
