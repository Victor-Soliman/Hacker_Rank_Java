package JavaProblems.String;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String converted = Integer.toString(n);
        if(!converted.isEmpty()){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }

    }
}
