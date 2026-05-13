package Recursion;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // input number

        // Loop from 2 to n
        for (int i = 2; i <= n; i++) {

            // Keep dividing while i is a factor
            while (n % i == 0) {
                System.out.println(i);  // print factor
                n = n / i;              // reduce n
            }
        }
    }
}
