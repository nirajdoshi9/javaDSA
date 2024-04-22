package Basics;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer no.: ");
        int n = sc.nextInt();
        System.out.println("Reverse of integer is : "+ reverseOfNumber(n));
    }

    public static int reverseOfNumber(int n){
        int rev = 0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n /= 10;
        }
        return rev;
    }

}
