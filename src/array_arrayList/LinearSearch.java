package array_arrayList;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        // find x in the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();

        int[]  arr = new int[n];
        System.out.print("Enter array element : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element : ");
        int target = sc.nextInt();


        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
//                System.out.print("target found! ");
                flag = true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Target found..");
        }
        else{
            System.out.println("Target not found..");
        }
    }
}


/*

Enter Size of array : 5
Enter array element : 1 2 3 4 5
Enter target element : 3
Target found..

Process finished with exit code 0
 */