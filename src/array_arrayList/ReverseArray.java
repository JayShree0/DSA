package array_arrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        /*
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

         */

        /*
        // reverse array
        for(int i = 0; i < n/2; i++) {
            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

         */

        // 2nd way
        System.out.println("Reverse 2nd way");
        int i = 0;
        int j = n-1;
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }



}
