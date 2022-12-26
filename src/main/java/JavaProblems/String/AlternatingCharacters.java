package JavaProblems.String;

public class AlternatingCharacters {
    public static void main(String[] args) {
        String s = "AAABBB";
        int count = 0;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s.replace(String.valueOf(s.charAt(i + 1)), "");
                count++;
            }
        }

        System.out.println(count);
    }
}
