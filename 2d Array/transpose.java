import java.io.*;
import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------- Transpose Matrix -----------");

        int[][] cloneArr = new int[n][n];

        for (int i = 0; i < cloneArr.length; i++) {
            for (int j = 0; j < cloneArr.length; j++) {
                cloneArr[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(cloneArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------ Rotate By 90 ------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = cloneArr[i][j];
                cloneArr[i][j] = cloneArr[i][cloneArr[0].length - 1 - j];
                cloneArr[i][cloneArr[0].length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < cloneArr.length; i++) {
            for (int j = 0; j < cloneArr.length; j++) {
                System.out.print(cloneArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
