package array_arrayList;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 6},
                        {2, -9, 3},
                        {5, 10, 3}};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

        }
        System.out.println(max);
    }
}
