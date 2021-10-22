import java.util.Scanner;

public class BreakingLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input : ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("quit")){
                // System.out.println(input);
                break;
            }
            System.out.println(input);
        }
    }
}
