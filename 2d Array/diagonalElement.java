import java.io.*;
import java.util.*;

public class diagonalElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int len_of_arr = arr.length;

        for (int gap = 0; gap < len_of_arr; gap++) {
            for (int j = 0, i = gap; i < len_of_arr; j++, i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}