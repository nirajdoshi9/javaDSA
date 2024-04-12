package Basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer no.: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of two numbers: "+ lcm(a,b));
    }

    public  static int lcm(int a, int b){
        int i = 1;
        while(true){
            int fact = a * i;
            if(fact % b ==0)
                return fact;
            i++;
        }
    }
}
