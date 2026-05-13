package array_arrayList;

public class Sort0s1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0};
        int n = arr.length;

        /*
        int noOfZeros = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0){
                noOfZeros++;
            }
        }

        for(int i = 0; i < n; i++) {
            if(i < noOfZeros){
                arr[i] = 0;
            }
            else arr[i] = 1;
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }

         */

        int i = 0;
        int j = n-1;
        while(i <= j) {
            if(arr[i] == 0) {
                i++;
            }
            else if(arr[j] == 1) {
                j--;
            }
            else  { // (arr[i] == 1 && arr[j] == 0)
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }


    }

}
