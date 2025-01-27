package org.example;

import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(hasDuplicate(nums));

    }

    //    public static boolean hasDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length-1; i++)
//        {
//            for(int j = i+1 ; j < nums.length ; j ++ ){
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false ;
//    }
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ref = new HashSet<>();
        for (int i : nums) {
            ref.add(i);
        }
        if (ref.size() != nums.length) {
            return true;
        }
        return false;
    }
}


