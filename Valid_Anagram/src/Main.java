import java.util.ArrayList;
import java.util.HashMap;

//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//Example 1:
//
//Input: s = "racecar", t = "carrace"
//
//Output: true
//Example 2:
//
//Input: s = "jar", t = "jam"
//
//Output: false

public class Main {
    public static void main(String[] args) {
        String s1 = "jar";
        String s2 = "jam";
        System.out.println(isAnagram(s1, s2));

    }

    public static boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length()){
//            return false;
//        }
//        HashMap<Character, Integer> charCounter = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
//        }
//        for (char c : t.toCharArray()) {
//            charCounter.put(c, charCounter.getOrDefault(c, 0) -1);
//        }
//        for (int count : charCounter.values()) {
//            if (count != 0) {
//                return false;
//            }
//        }
//        return true;
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an ArrayList to store characters of the first string
        ArrayList<Character> s1 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            s1.add(c);
        }

        // Convert the second string to a char array
        char[] s2 = t.toCharArray();

        // Loop through the second string's characters
        for (char c : s2) {
            // If the character is found in the ArrayList, remove it
            if (s1.contains((Character) c)) {
                s1.remove((Character) c); // Cast to Character to avoid removing by index
            } else {
                // If the character is not found, the strings are not anagrams
                return false;
            }
        }

        // If the ArrayList is empty, the strings are anagrams
        return s1.isEmpty();
    }
}
