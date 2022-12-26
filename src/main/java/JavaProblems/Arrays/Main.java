package JavaProblems.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        int n = 7;
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);

        int count = 0;

        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (Integer temp : ar) {
            if (!pairs.containsKey(temp))
                pairs.put(temp, 1);
            else {
                pairs.put(temp, pairs.get(temp) + 1);
                if (pairs.get(temp) % 2 == 0)
                    count++;
            }
        }
        System.out.println(count);

    }

}

