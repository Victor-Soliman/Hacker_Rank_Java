package JavaProblems.DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contacts = input.nextInt();
        input.nextLine();
        Map<String, Integer> map = new HashMap<>(contacts);

        for (int i = 0; i < contacts; i++) {
            String name = input.nextLine().trim();
            int phone = input.nextInt();
            input.nextLine(); // usually after you ask for an integer from the console , there is a bug , you should write this
            map.put(name, phone);

        }

        while (input.hasNext()) {
            String query = input.nextLine();
            if (map.containsKey(query)) {
                System.out.println(query + "=" + map.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
