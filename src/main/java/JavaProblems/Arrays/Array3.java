package JavaProblems.Arrays;


public class Array3 {
    public static void main(String[] args) {
        String s = "lbibiaiuiuubivbaiivpiubaaaaaibijbkjbaajbaajbhka";
        Long n = 47L;
//        int num = 0;
//
//        // f : the number of a in the first n numbers
//        String newString = s.substring(0, Math.toIntExact(n));
////        char[] chars = newString.toCharArray();
//
//        if (newString.contains("a")) {
//            char[] chars = newString.toCharArray();
//            for (char temp : chars) {
//                num++;
//            }
//            System.out.println(num);
//        }
//        else {
//            System.out.println(n);
//        }
        long givenAsCount = s.chars().filter(e -> e == 'a').count();
        long size = s.length();

        if (n % size == 0) {
            System.out.println(givenAsCount * (n / size));
        } else {
            long div = n / size;
            int endIndx = (int) (n - (div * size));
            String subStr = s.substring(0, endIndx);
            System.out.println(givenAsCount * div + subStr.chars().filter(e -> e == 'a').count());

        }
    }
}

