//Two Integer Sum II
//Given an array of integers numbers that is sorted in non-decreasing order.
//
//Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
//
//There will always be exactly one valid solution.
//
//Your solution must use
//O
//        (
//1
//        )
//O(1) additional space.
//
//Example 1:
//
//Input: numbers = [1,2,3,4], target = 3
//
//Output: [1,2]
//Explanation:
//The sum of 1 and 2 is 3. Since we are assuming a 1-indexed array, index1 = 1, index2 = 2. We return [1, 2].
//
//Constraints:
//
//        2 <= numbers.length <= 1000
//        -1000 <= numbers[i] <= 1000
//        -1000 <= target <= 1000


import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] numbers = {1,2,3,4};
    int target = 5;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[2];
    }
}
