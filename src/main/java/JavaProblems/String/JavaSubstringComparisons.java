package JavaProblems.String;

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


        // second solution
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String temp = s.substring(i, i + k);
            if (temp.compareTo(smallest) < 0) {
//                System.out.println("Smallest: " + temp.compareTo(smallest));
                smallest = temp;
//                System.out.println("* " + smallest);
            } else if (temp.compareTo(largest) > 0) {
//                System.out.println("largest: " + temp.compareTo(largest));
                largest = temp;
//                System.out.println("# " + largest);
            }
        }

//        System.out.println(smallest + "\n" + largest);


    }
}
