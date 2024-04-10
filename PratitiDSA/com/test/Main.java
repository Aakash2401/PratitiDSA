package com.test;

class Memo {
    public static int fib(int n) {
        System.out.println("Memoization : " + n);
        if(n<=1)
            return n;
        return Memo.fib(n-2) + Memo.fib(n-1);
    }
}

class Iterative {
    public static int fib(int n) {
        System.out.println("Iterative : " + n);
        if(n<=1)
            return n;

        int F[] = new int[10];
        F[0] = 0;
        F[1] = 1;
        int i = 2;
        for(; i<=n; i++) {
            F[i] = F[i-2] + F[i-1];
            System.out.println("Loop : " + i + " and " + F[i]);
        }
        return F[n];
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5; // You can change this value to calculate for a different 'n'

        long startTime = System.nanoTime();
        int memoResult = Memo.fib(n);
        long timetaken = (System.nanoTime()-startTime)/ 1000000;
        System.out.println("Time Taken : " + timetaken);

        long startTime1 = System.nanoTime();
        int iterativeResult = Iterative.fib(n);
        long timetaken2 = (System.nanoTime()-startTime1)/ 1000000;
        System.out.println("Time Taken : " + timetaken2);
    }
}