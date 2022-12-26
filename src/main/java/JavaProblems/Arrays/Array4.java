package JavaProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array4 {
    public static void main(String[] args) {
        int d = 4;
        List<Integer> numbers = new ArrayList<>(d);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        while(d>0){
            Integer temp= numbers.get(0);
            numbers.remove(0);
            numbers.add(temp);
            d--;
        }

        System.out.println(numbers);
    }
}
