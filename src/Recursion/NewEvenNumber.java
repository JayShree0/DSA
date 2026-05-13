package Recursion;

import java.util.Scanner;

public class NewEvenNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            boolean isNegative = n < 0;
            n = Math.abs(n);

            int result = 0;
            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit % 2 == 0) {
                    result = digit * place + result;
                    place *= 10;
                }

                n = n / 10;
            }

            if (isNegative)
                result = -result;

            System.out.println(result);
        }
    }
}
