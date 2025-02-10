package org.example;

//            You are climbing a staircase. It takes n steps to reach the top.
//
//            Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

class Solution {
    public static void main(String[] args) {
        System.out.println(climbStairs(8));
    }

    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 3;
        int b = 2;
        for (int i = 0; i < n - 3; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
