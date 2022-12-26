package JavaProblems.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MarkToys {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(20);
        prices.add(30);
        prices.add(40);
        prices.add(50);
        prices.add(50);
        prices.add(70);
        prices.add(80);

        int k = 50;
        int count = 0;
        int sum = 0;
        Collections.sort(prices);

        for (int i = 0; i < prices.size() - 1; i++) {
            if (k > sum) {
                sum += prices.get(i);
                if (k >= sum) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("-----");
        System.out.println("Another Solution");
        long[] array = prices.stream().mapToLong(value -> value).sorted().toArray();
        Arrays.parallelPrefix(array, Long::sum);
        int result = (int) Arrays.stream(array).filter(value -> value <= (long) k).count();
        System.out.println(result);
        System.out.println("========");


    }
}

