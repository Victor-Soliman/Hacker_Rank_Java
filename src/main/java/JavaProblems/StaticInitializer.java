package JavaProblems;

import java.util.Scanner;

public class StaticInitializer {
    static boolean flag;
    static int b , h;

    static {
        Scanner input = new Scanner(System.in);
         b = input.nextInt();
         h = input.nextInt();
        if (b >= 0 && h >= 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = b * h ;
            System.out.println(area);
        }

    }
}
