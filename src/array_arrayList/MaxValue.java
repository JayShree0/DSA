package array_arrayList;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
            max = Math.max(max, arr[i]);
        }

        System.out.println("Maximum value in array is : " + max);
    }
}

/*
Enter the size of Array : 7
Enter the element of array : 10 8 12 6 4 22 8
Maximum value in array is : 22

Process finished with exit code 0
 */