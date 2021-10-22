import java.util.Scanner;

public class iteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for (int i = 0 ; i < value ; i ++)
        if (i%2 == 0)
        System.out.println( i + " Even");
        System.out.println("All done");
    }
}
