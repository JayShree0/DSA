package array_arrayList;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {10, 23, 9, 34, 45, 67, 89};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        for(int i = 0; i < arr.length; i++ )
        {
            System.out.print(arr[i] + " ");
        }
    }
}
