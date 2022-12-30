package JavaProblems.BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaBigDecimal {
    public static void main(String[] args) {
        // first solution

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        String[] s = new String[]{"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
//        Stream<String> sorted = Arrays.stream(s).sorted(Comparator.reverseOrder());
//
//        System.out.println(Arrays.toString(s));
//        System.out.println(sorted.collect(Collectors.toList()));

        // second solution : hackerrank
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> stringComparator = new Comparator<String>() {

            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s, 0, n, stringComparator);


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

        // third solution : hacker rank
//        Comparator<String> stringComparator = new Comparator<String>() {
//
//            public int compare(String o1, String o2) {
//                BigDecimal a = new BigDecimal(o1);
//                BigDecimal b = new BigDecimal(o2);
//                return b.compareTo(a);
//            }
//        };
//        Arrays.sort(s, 0, n, stringComparator);
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//    }

    }
}
