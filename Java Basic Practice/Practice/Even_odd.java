import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        // int value = 0;
        for (int i = 0 ; i <= value;i++)
            if (i%2 == 0)
                System.out.println(i + " -> Even");
            else
            System.out.println(i + " -> Odd");
        
    }
}
