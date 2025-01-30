

//Valid Palindrome
//Given a string s, return true if it is a palindrome, otherwise return false.
//
//A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
//
//Example 1:
//
//Input: s = "Was it a car or a cat I saw?"
//
//Output: true
//Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
//
//Example 2:
//
//Input: s = "tab a cat"
//
//Output: false
//Explanation: "tabacat" is not a palindrome.
//
//Constraints:
//
//        1 <= s.length <= 1000
//s is made up of only printable ASCII characters.


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "tabacat";
        String h = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(h));
    }

// first try with for loop
//    public static boolean isPalindrome(String s) {
//        String h = s.trim().toLowerCase().replaceAll("[a-zA-Z0-9]", "");
//        int j = h.length() -1;
//        for (int i = 0; i < h.length() / 2 && j > h.length() / 2; i++, j--) {
//            if (h.charAt(i) == h.charAt(j)) {
//                return true;
//            }
//        }
//        return false;
//    }

    // second try while loop
    public static boolean isPalindrome(String s){
        String h = s.toLowerCase().trim().replaceAll("[a-zA-Z0-9]","");
        int i = 0 ;
        int j = h.length()-1 ;
        while (j>i){
            if(h.charAt(i)==h.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
