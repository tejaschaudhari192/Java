// package qns;

import java.util.Scanner;

public class prime_checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num) {
        for (int i = 2; i <= (num/2 + 1); i++)
            if ( num%i == 0 )
                return false;
        return true;
    }
}
