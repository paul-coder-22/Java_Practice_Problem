import java.util.Scanner;

/**
 * Loops
 */
public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input : ");
            input = scanner.nextLine();
            System.out.println(input);
        }
    }
}
