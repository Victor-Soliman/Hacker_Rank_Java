package JavaProblems.DataStructure;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        // first solution

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int m = input.nextInt();
//        input.nextLine();
//        int unique = 0;
//        Deque<Integer> deque = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            deque.add(input.nextInt());
//            if (!deque.contains(unique)) {
//                unique++;
//            }
//        }
//        System.out.println(unique);

        // second solution

//        Scanner in = new Scanner(System.in);
//        Deque<Integer> deque = new ArrayDeque<>();
//        int n = in.nextInt();
//        int m = in.nextInt();
//        in.nextLine();
//        int count = 0;
//
//        // populate the deque
//        for (int i = 0; i < m; i++) {
//            int num = in.nextInt();
//            deque.add(num);
//        }
//
//        System.out.println(deque);
//        // remove from first position and add at last position of deque
//        for (int i = 0; i < m; i++) {
//            deque.removeFirst();
//            int toAdd = in.nextInt();
//            deque.addLast(toAdd);
////            System.out.println(deque);
////            System.out.println(deque.peekFirst() + " " + deque.peekLast());
//            if (deque.contains(toAdd)) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // third solution hacker rank
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            deque.add(num);
            set.add(num);

            if(set.size()>max){
                max = set.size();
            }
            if(deque.size() == m){
                Integer item = deque.remove();
                if(!deque.contains(item)){
                    set.remove(item);
                }
            }
        }
        System.out.println(max);
    }

}


