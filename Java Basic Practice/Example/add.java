/* public class add {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    } 
}
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // read first array of input
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        // read second array of input
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        // substracting now and store in ans
        int[] ans = new int[n2];
        int sub = n2 - n1;
        for (int i = n2 - 1; i >= 0; i--) {
            if (i - sub < 0) {
                ans[i] = a2[i];
                continue;
            }
            int current = a2[i] - a1[i - sub];
            if (current >= 0) {
                ans[i] = current;
            } else {
                int j = i - 1;
                while (j >= 0 && a2[j] == 0) {
                    a2[j] = 9;
                    j--;
                }
                a2[j] = a2[j] - 1;
                ans[i] = current + 10;
            }
        }
        // printing value
        boolean b = false;
        for (int i = 0; i < n2; i++) {
            if (b) {
                System.out.println(ans[i]);
            } else if (ans[i] != 0) {
                System.out.println(ans[i]);
                b = true;
            }
        }
    }
}