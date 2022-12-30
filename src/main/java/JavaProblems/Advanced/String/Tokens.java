package JavaProblems.Advanced.String;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        // first solution

//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        System.out.println(s);
//        System.out.println(s.trim());

//        if (s.length() == 0){
//            System.out.println("0");
//        }
//        else{
//            String[] arrs = s.split("[\\s!,?._'@]+");
//
//            System.out.println(arrs.length);
//            for (String a : arrs){
//                System.out.println(a);
//            }
//        }
//        scan.close();


        // second solution
        //  Scanner scan = new Scanner(System.in);
        //        String s = scan.nextLine();
        //
        //        String regex = "[A-Za-z !,?._'@]+";
        //        Pattern pattern = Pattern.compile(regex);
        //        Matcher matcher = pattern.matcher(s);
        //        if(matcher.find()){
        //          String[] splitted = s.trim().split("[\\s!,?._'@]+");
        //          if(1 <= splitted.length && splitted.length <= 4 * Math.pow(10,5)){
        //               System.out.println(splitted.length);
        //          for(int i = 0 ; i< splitted.length ; i++){
        //              System.out.println(splitted[i]);
        //          }
        //          }
        //
        //        }else{
        //            System.out.println("0");
        //        }
        //
        //        scan.close();
        //    }


        // third solution : hacker rank

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            System.out.println("0");
        } else {
            String s = scanner.nextLine();
            String[] string = s.trim().split("[ -!,?._'@]+");
            if (1 <= s.length() && s.length() <= 4 * Math.pow(10, 5)) {
                System.out.println(string.length);
                for (String element : string) {
                    System.out.println(element);
                }
            }
        }
    }
}

