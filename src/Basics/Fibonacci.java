package Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. upto which you want to print Fibonacci Series:");
        int n = sc.nextInt();
        printFib(n);
    }

    public static void printFib(int n){
        if(n<0) return;
        System.out.print("0 ");
        if(n == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while(first + second <= n) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
