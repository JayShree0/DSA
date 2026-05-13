package tcsNQT;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0)
        {
            int digit = n % 10; // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            n = n / 10; // remove last digit
        }

        System.out.println("Reverse Number: " + reverse);
    }
}
