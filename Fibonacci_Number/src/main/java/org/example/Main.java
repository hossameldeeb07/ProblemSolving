package org.example;

//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
class Solution {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));

    }

//    public static int fib(int n) {
//        //n is the nth number in the fibonacci series
//        //the order of this method is 2^n
//        //Base Case for recursion
//        if (n <= 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

    public static int fibonacci(int n) {
        //Time Complexity is O(N) which is linear
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }
}