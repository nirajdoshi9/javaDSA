package Basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer no.: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of two numbers: "+ gcd(a,b));
    }

    public static int gcd(int a, int b){
        int least = Math.min(a,b);
        int ans = 1;
        int i = 2;
        while(i<=least){
            if(a%i ==0 && b%i == 0)
                ans = i;
            i++;
        }
        return ans;
    }
}
