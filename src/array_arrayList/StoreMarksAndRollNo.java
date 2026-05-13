package array_arrayList;

import java.util.Scanner;

public class StoreMarksAndRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("-------Marks and Roll No---------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*

-------Marks and Roll No---------
1 50
2 60
3 70
4 80

Process finished with exit code 0
 */