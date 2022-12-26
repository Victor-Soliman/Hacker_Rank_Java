package JavaProblems.Advanced.JavaSHA256;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        input.close();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(password.getBytes());
            byte[] hash = messageDigest.digest();
            for (byte b : hash) {
                System.out.printf("%02x",b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
