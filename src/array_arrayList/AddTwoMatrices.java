package array_arrayList;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 9, 2}, {3, 7, 4}, {8, 5, 6}};
        int[][] b = {{9, 3, 7}, {8, 6, 5}, {2, 4, 1}};
        int res[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
