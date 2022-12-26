package JavaProblems.DataStructure;

import java.io.IOException;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int[][] array = new int[6][6];

        int highest_Sum = -63; // pentru ca cel mai mic numar poate fi suma la toate numerele din intrebare

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = input.nextInt();
            }
        }


        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int current_sum = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (current_sum > highest_Sum) {
                    highest_Sum = current_sum;
                }
            }
        }
        System.out.println(highest_Sum);

//        List<List<Integer>> a = new ArrayList<>();
//        a.get(0).set(2,3); // pentru a aduga in 2d Lista
//        for (int i = 0; i <= 3; i++) {
//            for (int j = 0; j <= 3; j++) {
//                a.get(i).get(j)   // pentru a accesa elementul in lista
//            }}

    }
}
