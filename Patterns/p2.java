import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j <= (value - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 * for i in range(5): for j in range(5-i): print()
 */