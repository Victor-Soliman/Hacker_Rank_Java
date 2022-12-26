package JavaProblems.DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(4000);
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        for (int i = 0; i < numberOfElements; i++) { //12 0 1 78 12
            int elemet = input.nextInt();
            list.add(elemet);
        }
//        System.out.println(list);

        int numberOfQueries = input.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            String query = input.next();
            if (query.equals("Insert")) {
                int x = input.nextInt(); //5
                int y = input.nextInt(); //23
                list.add(x, y); //12 0 1 78 12 23
            } else {
                int x = input.nextInt();
                list.remove(x); //0 1 78 12 23
            }
        }
            // when working with collections it is better to iterate with iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
