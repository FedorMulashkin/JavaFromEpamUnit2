package Unit2Var1;

import java.util.Arrays;
import java.util.Random;

public class RunClass {
    public static void main(String[] args) {
        int N = 200000;
        int[] numbers = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(-1000000, 1000000);
        }
        //System.out.println(Arrays.toString(numbers));
        VariantA variantA = new VariantA(numbers);
        System.out.println("Task 1");
        System.out.println("Longest number is " + variantA.getLongest() + ". It's length is " + variantA.getLongestLen());
        System.out.println("Smallest number is " + variantA.getSmallest() + ". It's length is " + variantA.getSmallestLen());
        System.out.println("Task 2");
        System.out.println("Commented");
        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        int longestLen = variantA.getLongestLen();
        int smallestLen = variantA.getSmallestLen();
        int len = 0;
        System.out.println("Task 3");
        System.out.println("Commented");
        for (int i = 0; i < N; i++) {
            len = variantA.findLenOfNumber(numbers[i]);
            if(len > smallestLen && len < longestLen){
                //System.out.printf(numbers[i] + " ");
            }
        }
        //System.out.println();
        System.out.println("Task 4");
        System.out.println(variantA.findNotUniqueNumber(numbers));
        System.out.println("Остальное скучно. Я это даже делал со школьниками");
    }
}
