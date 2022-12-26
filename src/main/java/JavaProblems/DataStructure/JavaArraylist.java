package JavaProblems.DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        ArrayList[] list = new ArrayList[20000];

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList();
            int d = input.nextInt();
            for (int j = 0; j < d; j++) {
                int value = input.nextInt();
                list[i].add(value);
            }

        }
//        System.out.println(Arrays.toString(list));
        int query = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            try {
                System.out.println(list[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
}
