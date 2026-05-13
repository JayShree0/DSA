package tcsNQT;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while (n != 0)
        {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

    }
}
