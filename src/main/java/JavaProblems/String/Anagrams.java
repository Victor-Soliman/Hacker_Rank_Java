package JavaProblems.String;

public class Anagrams {
    public static void main(String[] args) {
        String a = "showman";
        String b = "woman";
        int totalDels = 0;

        for (int i = 0; i < a.length(); i++) {
            char aChar = a.charAt(i);

            if (b.indexOf(aChar) == -1)
                totalDels++;
            else
                b = b.replaceFirst(String.valueOf(aChar), "");
        }
        System.out.println(totalDels + b.length());
//        int countA = 0;
//        int countB = 0;
//        String substring1 = a.substring(1, 6);
//        String substring2 = a.substring(0, 4);
//        for (int i = 0; i < a.length(); i++) {
//            if (!(a.substring(0, a.length()-1).contains(substring1))) {
//                countA++;
//            }
//        }
//
//        for (int i = 0; i < b.length()-1; i++) {
//            if ((b.substring(0, a.length()).contains(substring2))) {
//                countB++;
//            }
//        }
//        for (int i = 0; i < a.length() ; i++) {
//            if (!(a.charAt(i) == 'a' || a.charAt(i) == 'd')) {
//                countA++;
//            }
//        }
//
//        for (int i = 0; i < b.length() ; i++) {
//            if (!(b.charAt(i) == 'a' || b.charAt(i) == 'd')) {
//                countB++;
//            }
//        }
//        System.out.println(countA + countB);

    }
}

