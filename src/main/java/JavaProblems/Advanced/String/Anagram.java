package JavaProblems.Advanced.String;

import java.util.Arrays;
import java.util.Scanner;

// hacker rank solution Anagrams
public class Anagram {
    static boolean isAnagram(String a, String b) {
        //1. remove white spaces , 2. remove case-sensitive
        a = a.replace(" ", "").toLowerCase();
        b = b.replace(" ", "").toLowerCase();

        // convert it to char array
        char[] a_char = a.toCharArray();
        char[] b_char = b.toCharArray();

        // sort it
        Arrays.sort(a_char);
        Arrays.sort(b_char);

        if(Arrays.equals(a_char,b_char)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
//
//    static boolean isAnagram(String a, String b) {
//        // declare the length og the strings
//        int a_length = a.length();
//        int b_length = b.length();
//        // if the length of the strings is not the same -> Not Anagrams
//        if (a_length != b_length) {
//            return false;
//        }
//
//        // convert the string to lower or upper case , cause the problem is case-insensitive
//        a = a.toLowerCase();
//        b = a.toLowerCase();
//
//        // declare a char_frequencies array of size alphabet = 26
//        int[] char_frequencies = new int[26];
//
//
//        for (int i = 0; i < a_length; i++) {
//            char current_char = a.charAt(i);
//            int index = current_char - 'a';
//            char_frequencies[index]++;
//        }
//
//        for (int i = 0; i < b_length; i++) {
//            char current_char = b.charAt(i);
//            int index = current_char - 'b';
//            char_frequencies[index]--;
//        }
//
//        for (int i = 0; i <= 26; i++) {
//            if (char_frequencies[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}

