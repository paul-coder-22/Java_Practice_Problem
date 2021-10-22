import java.io.*;
import java.util.*;

public class matrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int farrRow = sc.nextInt();
        int farrcol = sc.nextInt();
        int[][] firstArr = new int[farrRow][farrcol];

        for (int i = 0; i < farrRow; i++) {
            for (int j = 0; j < farrcol; j++) {
                firstArr[i][j] = sc.nextInt();
            }
        }

        int sarrRow = sc.nextInt();
        int sarrcol = sc.nextInt();
        int[][] secondArr = new int[sarrRow][sarrcol];

        // secondArr
        for (int i = 0; i < sarrRow; i++) {
            for (int j = 0; j < sarrcol; j++) {
                secondArr[i][j] = sc.nextInt();
            }
        }

        if (farrcol != sarrRow) {
            System.out.println("Invalid Input !");
            return;
        }
        int[][] newArr = new int[farrRow][sarrcol];

        for (int m = 0; m < farrRow; m++) { // 2

            for (int n = 0; n < sarrcol; n++) { // 4

                int printVal = 0;
                for (int k = 0; k < farrcol; k++) {
                    printVal += firstArr[m][k] * secondArr[k][n];
                }
                newArr[m][n] = printVal;
            }
        }

        for (int i = 0; i < farrRow; i++) {
            for (int j = 0; j < sarrcol; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
