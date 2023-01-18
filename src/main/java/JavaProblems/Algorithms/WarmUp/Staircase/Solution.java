package JavaProblems.Algorithms.WarmUp.Staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        /* n = 4  | numSpaces / numSymbols
        _ _ _ #        3            1
        _ _ # #        2            2
        _ # # #        1            3
        # # # #        0            4
         */

        for(int numSymbols = 1 ; numSymbols <= n ; numSymbols++){
            int numSpaces = n - numSymbols;
//            System.out.print(numSpaces + " " +  numSymbols);

            // print out the spaces
            for(int i = 0 ; i <= numSpaces ; i++ ){
                System.out.print(" ");
            }

            // print out the symbols
            for(int j = 0 ; j < numSymbols ; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
