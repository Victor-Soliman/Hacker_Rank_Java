//package Arrays;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Array2 {
//    public static void main(String[] args) {
//        List<Integer> c = new ArrayList<>();
//
//        List<Integer> indexofOnes = new ArrayList<>();
//
//        int lastIndexOfOnes = 0;
//        for (int i = 0; i < c.size(); i++) {
//            if (c.get(i) == 1) {
//                indexofOnes.add(i + 1);
//                lastIndexOfOnes = i + 1;
//            }
//        }
//        int jump = 0;
//        int beforeJump = 0;
//        int count = 0;
//        for (Integer item : indexofOnes) {
//            jump = (item - beforeJump + 1) / 2;
//            if (item - beforeJump == 1 || item - beforeJump == 0) {
//                jump++;
//            }
//            beforeJump = item;
//            count = count + jump;
//        }
//
////
////        int lastJump = (c.size() - lastIndexOfOnes) / 2;
////        int endOfJump = count + lastJump;
////        return endOfJump;
//    }
//}
