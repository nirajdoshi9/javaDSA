package Basics;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer no.: ");
        int n = sc.nextInt();
        isPrime(n);
    }

    public static void isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        int i = 2;
        while(i<=sqrt){
            if(n%i == 0) {
                System.out.println("Number is not Prime");
                return;
            }
            i++;
        }
        System.out.println("Number is Prime");
    }
}
