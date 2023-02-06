package JavaProblems.Algorithms.BitManipulation.General;

public class Main {
    public static void main(String[] args) {
        // https://www.youtube.com/watch?v=qfH2Fkc1ujg&list=PLVDYxb1dYhnqoD2wSMsHx0UPXTRNIh7JW&index=21
        //  https://www.youtube.com/watch?v=k1i6eIpeXak

        int a = 15;
        int b = 27;


        // 15 = 0000 1111  in Binary
        // 27 = 0001 1011  in Binary

        // 11 = 0000 1011  -> for AND : it will give 1 if both are one

        // 31 = 0001 1111  -> for OR  : it will give 1 if one of them is 1 even if both are 1

        // 20 = 0001 0100  -> for XOR :if you do xor of 2 elements and one of them is 0 ,
        // it will give you the other element ==> HERE :it will give 1 if one of them is 1

        // -16 = 0001 0000 -> for One Complement : by calculator

        // 60 = 0011 1100  -> for Left Shift : you shift the binary number to the left by (2 in our case)

        // 3 = 0000 0011  -> for Right Shift : you shift the binary number to the right by (2 in our case)

        // 3 = 0000 0011  -> for Shift Right Zero Operator : the shifted values will be hold up by zeros

        // Binary AND Operators(&)
        int and = a & b;

        // Binary OR Operator(|)
        int or = a | b;

        // Binary XOR Operator(^)
        int xor = a ^ b;

        // Binary One Complement Operators(~)
        int oneComplement = ~a;

        // Binary Left Shift Operators(<<)
        int leftShift = a << 2;

        // Binary Right Shift Operators(>>)
        int rightShift = a >> 2;

        // Binary Right Shift zero fill operator(>>>)
        int shiftRightZero = a >>> 2;

        System.out.println("AND Operator: " + and);
        System.out.println("OR Operator: " + or);
        System.out.println("XOR Operator: " + xor);
        System.out.println("One Complement Operator: " + oneComplement);
        System.out.println("Left Shift Operator: " + leftShift);
        System.out.println("Right Shift Operator: " + rightShift);
        System.out.println("Shift Right Zero Operator: " + shiftRightZero);

    }
}
