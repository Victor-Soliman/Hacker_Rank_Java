package JavaProblems.DataStructure.BitSet;

import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        System.out.println(bits1);
        System.out.println(bits2);
        System.out.println("________");
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) == 0) bits2.set(i);
        }


        System.out.println("Initial Pattern in bits1:");
        System.out.println(bits1);
        System.out.println("\nInitial Pattern in bits2:");
        System.out.println(bits2);

        System.out.println("_________");

        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1:");
        System.out.println(bits2);

        System.out.println("_________");
        bits2.or(bits1);
        System.out.println("\nbits 2 or bits1:");
        System.out.println(bits2);
        System.out.println(bits1);

        System.out.println("__________");
        bits2.xor(bits1);
        System.out.println("\n bits2 XOR bits1:");
        System.out.println(bits2);


    }
}
