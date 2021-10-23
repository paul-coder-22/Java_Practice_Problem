import java.io.*;
import java.util.*;

public class diagonalElement {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int len_of_arr = arr.length;

        for (int gap = 0; gap < len_of_arr; gap++) {
            for (int j = 0, i = gap; i < len_of_arr; j++, i++) {
                System.out.println(arr[j][i]);
            }
        }
    }
}