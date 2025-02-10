


//Group Anagrams
//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//Example 1:
//
//Input: strs = ["act","pots","tops","cat","stop","hat"]
//
//Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
//Example 2:
//
//Input: strs = ["x"]
//
//Output: [["x"]]

import java.lang.reflect.Array;
import java.util.*;

;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // we create a Hashmap to include the matched strings
        HashMap<String,List<String>> map = new HashMap<>();
        // Loop through each word in the input array
        for(String s : strs){
            //create an array of chars of each word
            char[] chars = s.toCharArray();
            //sort each element in the array of chars to create unique key for the hashmap
            Arrays.sort(chars);
            //store each sorted word in new String to use as a key for the HashMap
            String sortedWord =new String(chars);
            // check if the Hashmap already holds that key before or not if not put it in the map with a new arraylist as value
            if (!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            //now add the original word that matches this case
            map.get(sortedWord).add(s);
        }
        // return the list of lists
        return new ArrayList<>(map.values());
    }
}
