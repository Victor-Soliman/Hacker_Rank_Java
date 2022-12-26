package JavaProblems.Advanced.JavaMD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        input.close();

        try {
            // from class MessageDigest , you get an instance of the algorithm (MD5) you want to work with
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            // you use update method to get the bytes
            messageDigest.update(password.getBytes());
            // use the method digest to get it done
            byte[] hash = messageDigest.digest();

            // iterate to print the encoded password using regex
            for(byte b : hash){
                System.out.printf("%02x",b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }
}
