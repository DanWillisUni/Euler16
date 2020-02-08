package com.company;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(2);
        n = n.pow(1000);
        System.out.println(sumOfDigits(n.toString()));
    }
    private static int sumOfDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int j = Integer.parseInt(String.valueOf(c));
            sum += j;
        }
        return sum;
    }
}
