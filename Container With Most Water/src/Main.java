//Container With Most Water
//You are given an integer array heights where heights[i] represents the height of the
//        i
//t
//        h
//i
//        th
//bar.
//
//You may choose any two bars to form a container. Return the maximum amount of water a container can store.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        int[] height = {1, 7, 2, 5, 4, 7, 3, 6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        while (r > l) {
            int area = Math.min(heights[r], heights[l]) * (r - l);
            res = Math.max(area, res);
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}