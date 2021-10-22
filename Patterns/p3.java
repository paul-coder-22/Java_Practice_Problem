import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        for (int i = 1; i <= value ; i++){
            for (int j = value;j >= i ; j -- )
                System.out.print(" ");
            for (int k = 1; k <= i ; k ++)
                System.out.print(" *");
            System.out.println();
        }

    }
}
