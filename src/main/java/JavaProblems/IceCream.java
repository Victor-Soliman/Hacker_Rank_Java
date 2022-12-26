package JavaProblems;

import java.util.HashMap;
import java.util.Map;

public class IceCream {
    public static void main(String[] args) {
        int t = 2;
        int money = 5;
        Map<Integer, Integer> cost = new HashMap<>();
        cost.put(1, 1);
        cost.put(2, 4);
        cost.put(3, 5);
        cost.put(4, 3);
        cost.put(5, 2);

        for (int i = 0; i < cost.size() - 1; i++) {
            if (cost.get(i) + cost.get(i + 1) <= money) {
                System.out.println(cost.get(i));
            }
        }


    }
}
