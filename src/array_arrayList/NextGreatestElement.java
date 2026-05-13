package array_arrayList;

import java.util.Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
//        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int[] arr = {6, 8, 0, 1, 3};
//        int[] arr = {1, 3, 2, 4};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        Arrays.fill(ans, -1);

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
