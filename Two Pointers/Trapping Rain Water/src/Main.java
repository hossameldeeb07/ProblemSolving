//Trapping Rain Water
//You are given an array non-negative integers height which represent an elevation map. Each value height[i] represents the height of a bar, which has a width of 1.
//
//Return the maximum area of water that can be trapped between the bars.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        int[] height = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int sum = 0;
        int left = 0;
        int largeLeft = height[left];
        int right = height.length - 1;
        int largeRight = height[right];
        while (left < right) {
            if (largeLeft < largeRight) {
                left++;
                largeLeft = Math.max(largeLeft, height[left]);
                sum += largeLeft - height[left];
            } else {
                right--;
                largeRight = Math.max(largeRight, height[right]);
                sum += largeRight - height[right];
            }
        }
        return sum;
    }

}
