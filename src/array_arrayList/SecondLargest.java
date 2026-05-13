package array_arrayList;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }

            // "If this number is smaller than max but bigger than current secondMax, then update secondMax."
            else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondLargest);

    }
}
