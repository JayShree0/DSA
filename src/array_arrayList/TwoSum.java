package array_arrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, -1};
        int x = 9;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        if(flag){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found..");
        }

    }
}
