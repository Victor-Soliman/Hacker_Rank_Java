package JavaProblems.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next().toUpperCase();
        String b = input.next().toUpperCase();
        // th idea is to 1.convert each string to array ,sort it ,and then, check if it is the same
        // ps the length of the 2 arrays are same


        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        if (aArray.length != bArray.length) {
            System.out.println("Not Anagrams");
            System.exit(0);
        }

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        for (int i = 0; i <= aArray.length - 1; i++) {
            if (aArray[i] != bArray[i]) {
                System.out.println("Not Anagrams");
                System.exit(0);
            }
        }
        System.out.println("Anagrams");
    }
}

