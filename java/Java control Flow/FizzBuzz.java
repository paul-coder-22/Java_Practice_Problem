import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int Number = scanner.nextInt();
        if (Number%3 == 0 && Number%5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (Number%3 == 0){
            System.out.println("Buzz");
        }
        else if (Number%5 == 0) {
            System.out.println("Fizz");
        }
        else{
            System.out.println(Number);
        }
    }
}
