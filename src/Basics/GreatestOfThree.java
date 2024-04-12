package Basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter three nos.");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();


            if (a >= b) {
                if (a >= c) {
                    System.out.println("Greatest no. is: " + a);
                } else {
                    System.out.println("Greatest no. is: " + c);
                }
            } else {
                if (b >= c)
                    System.out.println("Greatest no. is: " + b);
                else
                    System.out.println("Greatest no. is: " + c);
            }
        }
    }
}
