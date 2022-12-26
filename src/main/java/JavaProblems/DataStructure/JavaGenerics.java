package JavaProblems.DataStructure;

public class JavaGenerics {
    public static void main(String[] args) {

        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = i + 1;
        }

        String[] sArray = new String[2];
        sArray[0] = "Hello";
        sArray[1] = "World";

        printArray(array, sArray);


    }

        private static void printArray(int[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(String.valueOf(a[i]));
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }


}
