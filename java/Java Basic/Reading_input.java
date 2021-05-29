import java.util.Scanner;

public class Reading_input {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Name : ");
    String name = scanner.nextLine().trim();
    System.out.println("Your are " + name);
    } 
}
