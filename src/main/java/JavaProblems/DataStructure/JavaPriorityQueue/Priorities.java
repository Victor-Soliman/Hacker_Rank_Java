package JavaProblems.DataStructure.JavaPriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {


    public ArrayList<Student> getStudents(List<String> events) {

        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<>();
        for (String i : events) {
            String[] s = new String[4];
            s = i.split("\\s");
            if (s.length > 1) {
                pq.add(new Student(s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3])));
            } else {
                pq.poll();
            }
        }
        while (pq.size() > 1) {
            System.out.println(pq.poll().getName());
        }
        return new ArrayList<Student>(pq);
    }
}
