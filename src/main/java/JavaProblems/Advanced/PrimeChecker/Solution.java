package JavaProblems.Advanced.PrimeChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());

        Prime prime = new Prime();

        prime.checkPrime(n1);
        prime.checkPrime(n1,n2);
        prime.checkPrime(n1,n2,n3);
        prime.checkPrime(n1,n2,n3,n4);
        prime.checkPrime(n1,n2,n3,n4,n5);

    }


}

