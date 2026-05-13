package array_arrayList;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40 , 33, 20, 15, 67};
        for(int ele : arr){
            System.out.print(ele + " "); // 30, 10, 40 , 33, 20, 15, 67
        }
        System.out.println();
        // Shallow copy
        int[] shallowCopy = arr;
        shallowCopy[0] = 70;
        System.out.println("arr[0] " + arr[0]); // 70
        System.out.println("shallowCopy[0] " +  shallowCopy[0]); // 70

        // Deep copy
        // 1st way
        System.out.println("-------Deep Copy-------");
        int[] deepCopy = Arrays.copyOf(arr, arr.length);
        System.out.println("--Deep Copy 1st way--");
        for(int ele : deepCopy){
            System.out.print(ele + " ");
        }
        System.out.println();
        deepCopy[0] = 80;
        System.out.println("arr[0]" + arr[0]);
        System.out.println("deepCopy[0]" + deepCopy[0]);

        System.out.println("--Deep copy 2nd way--");
        // 2nd way
        int[] dCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dCopy[i] = arr[i];
        }

        for(int ele : dCopy){
            System.out.print(ele + " ");
        }
    }
}
