package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1st no.: ");
        int a = input.nextInt();
        System.out.print("Please enter 2nd no.: ");
        int b = input.nextInt();
        System.out.println("Sum of your numbers is: "+ (a+b));
        System.out.println("Diff of your numbers is: "+ (a-b));
        System.out.println("Multiplication of your numbers is: "+ (a*b));
        System.out.println("Division of your numbers is: "+ (a/b));
        System.out.println("Modulus of your numbers is: "+ (a%b));

        System.out.println("Enter two floating numbers");
        float a1 = input.nextFloat();
        float b1 = input.nextFloat();
        System.out.println("Multiplication of two float no.s :"+ (a1*b1));

        //convert Fahrenheit to Celsius
        System.out.println("\nEnter Temp. in Fahrenheit:");
        float far = input.nextFloat();
        float res = (far -32)*5/9;
        System.out.println("Temp. in Celsius:"+ res);
    }
}
