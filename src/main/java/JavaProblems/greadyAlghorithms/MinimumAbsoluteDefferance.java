package JavaProblems.greadyAlghorithms;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDefferance {
    public static void main(String[] args) {
//        int[] array = new int[]{1, 6, 8, 7, -2, -3, 4};
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(-7);
        arr.add(0);
//        arr.add(7);
//        arr.add(-2);
//        arr.add(-3);
//        arr.add(4);

        int minAbs = Integer.MAX_VALUE;


        for (int i = 0; i < arr.size() - 1; i++) {
            int tempAbs = Math.abs(arr.get(i) - arr.get(i + 1));
            if (tempAbs < minAbs) {
                minAbs = tempAbs;
            }
//        }
//        for (int i = 0; i < array.length - 1; i++) {
//            int tempAbs = Math.abs(array[i] - array[i + 1]);
//            if (tempAbs < minAbs) {
//                minAbs = tempAbs;
//            }
//        }

        }
        System.out.println(minAbs);
    }
}

