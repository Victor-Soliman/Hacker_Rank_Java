package JavaProblems.Advanced.String;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();
        // first solution
//        List<String> lexicographicalList = new ArrayList<>();
//
//        for (int i = 0; i <= s.length() - k; i++) {
//            String substring = s.substring(i, i + k);
//            lexicographicalList.add(substring);
//        }
//        Collections.sort(lexicographicalList);
//        System.out.println(lexicographicalList.get(0) + " " + lexicographicalList.get(lexicographicalList.size()-1));


        // second solution hacker rank
        String current_subString = s.substring(0, k);
        String smallest = current_subString;
        String largest = current_subString;

        for (int i = 1; i <= s.length() - k; i++) {
            current_subString = s.substring(i, i + k);
            if (current_subString.compareTo(smallest) < 0) {
                smallest = current_subString;
            } else if (current_subString.compareTo(largest) > 0) {
                largest = current_subString;
            }
        }

        System.out.println(smallest + "\n" + largest);


    }
}
