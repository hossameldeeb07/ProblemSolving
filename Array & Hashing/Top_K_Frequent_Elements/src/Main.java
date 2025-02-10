//Top K Frequent Elements
//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//
//The test cases are generated such that the answer is always unique.
//
//You may return the output in any order.
//
//        Example 1:
//
//Input: nums = [1,2,2,3,3,3], k = 2
//
//Output: [2,3]
//Example 2:
//
//Input: nums = [7,7], k = 1
//
//Output: [7]
//Constraints:
//
//        1 <= nums.length <= 10^4.
//        -1000 <= nums[i] <= 1000
//        1 <= k <= number of distinct elements in nums.


import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i : nums) {
            set.put(i, set.getOrDefault(i, 0) + 1);
        }


    }
}