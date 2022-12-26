package JavaProblems.DataStructure.BitSet;

import java.util.BitSet;

public class BitConstructor {
    public static void main(String[] args) {
        // the array size of BitSet is flexible
        // BitSet is an array with 0 based
        // the bit value can be accessed by positive value only
        // the default value of the bit is boolean
        // cleat method on bitset clear the array and make has the value of False
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet(6);

        bs1.set(0);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);

        bs2.set(4);
        bs2.set(6);
        bs2.set(5);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);

        System.out.println("bs1 = " + bs1);
        System.out.println("bs2 = " + bs2);
    }
}
