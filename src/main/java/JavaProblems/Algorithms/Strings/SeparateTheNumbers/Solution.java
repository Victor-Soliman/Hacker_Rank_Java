package JavaProblems.Algorithms.Strings.SeparateTheNumbers;

/*
 * Complete the 'separateNumbers' function below.
 *
 * The function accepts STRING s as parameter.
 */
class Solution {
    public static void main(String[] args) {
        String s = "1234";
        boolean isValid = false;
        String subString = "";

        for (int i = 1; i <= s.length() / 2; i++) {
            subString = s.substring(0, i);
            Long validLong = Long.parseLong(subString);
            String validString = subString;

            while (validString.length() < s.length()) {
                validString += Long.toString(++validLong);
            }
            if (s.equals(validString)) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + subString : "NO");
    }
}


