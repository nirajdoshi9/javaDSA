package Basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer no.: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits in integer is : "+ sumOfDigits(n));
    }

    public static int sumOfDigits(int n){
        int sum =  0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
