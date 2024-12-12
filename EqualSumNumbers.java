//Q2. Write a program to find all n-digit numbers with an equal sum where n varies from 1 to 9 and 
//sum <= 81 (Maximum possible sun in a 9-digit number). 

import java.util.*;

public class EqualSumNumbers {
    public static void findNumbers(int n, int targetSum) {
        generateNumbers("", n, targetSum);
    }

    private static void generateNumbers(String prefix, int n, int targetSum) {
        if (n == 0 && targetSum == 0) {
            System.out.println(prefix);
            return;
        }
        if (n == 0 || targetSum < 0)
            return;

        for (int digit = (prefix.isEmpty() ? 1 : 0); digit <= 9; digit++) {
            generateNumbers(prefix + digit, n - 1, targetSum - digit);
        }
    }

    public static void main(String[] args) {
        int n = 5, targetSum = 42;
        System.out.println("5-digit numbers with sum 42:");
        findNumbers(n, targetSum);
    }
}
