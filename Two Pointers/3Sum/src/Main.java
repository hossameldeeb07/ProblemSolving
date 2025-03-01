import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//3Sum
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.
//
//The output should not contain any duplicate triplets. You may return the output and the triplets in any order.
//
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//
//Example 2:
//
//Input: nums = [0,1,1]
//
//Output: []
//Explanation: The only possible triplet does not sum up to 0.
//
//Example 3:
//
//Input: nums = [0,0,0]
//
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.
//
//Constraints:
//
//        3 <= nums.length <= 1000
//        -10^5 <= nums[i] <= 10^5

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            //if you find that nums[i] > 0 break >>> why >>> because if the first element is > than 0 its impossible to get a sum of 0
            if (nums[i] > 0) {
                break;
            }
            // to remove duplicates at the first
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicate values for k >> you don't need to remove duplicates at j because it follows i which removes the duplicates for u
                    while (j < k && nums[k] == nums[k + 1]){
                        k--;
                    }
                } else if (sum < 0) {
                    j++; // Increase left pointer to get a larger sum
                } else {
                    k--; // Decrease right pointer to get a smaller sum
                }
            }
        }
        return ans;
    }
}
