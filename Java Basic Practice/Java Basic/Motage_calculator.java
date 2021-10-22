import java.text.NumberFormat;
import java.util.Scanner;


public class Motage_calculator {
    public static void main(String[] args) {
        
        
        int princple = 0;
        float rate_of_intrest = 0;
        byte years = 0;
        float monthlyIntrest = 0;
        int numberOfPayment = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principle ($1K - $1M) : ");
            princple = scanner.nextInt();
            if (princple >= 1000 && princple <= 1_000_000){
                break;
            }
            System.out.println("Enter the value between 1000 and 1,000,000");
        }

        

        while (true) {
            System.out.print("Annual Rate of Intrest : ");
            rate_of_intrest = scanner.nextFloat();
            if (rate_of_intrest >= 1 && rate_of_intrest <= 30)

                break;

            System.out.println("Enter the Value between 1 to 30. ");
        }
        while (true) {
            System.out.print("Period This Year");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter valid years between 1 to 30.");
        }
          
        double moratge = calculateMortage(princple, rate_of_intrest, years);

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(moratge);
        System.out.println("Mortgage " + mortageFormatted );
    }

    public static double calculateMortage(int princple,
    float rate_of_intrest,
    byte years) {
        final byte Months_in_year = 12;
        final byte Percent = 100;

        float monthlyIntrest = rate_of_intrest / Percent / Months_in_year;
        short numberOfPayment = (short) (years * Months_in_year);



        double mortage = princple *(monthlyIntrest * Math.pow(1+monthlyIntrest, numberOfPayment)/Math.pow(1+monthlyIntrest, numberOfPayment)-1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Mortage: " + mortageFormatted);

        return mortage;
    }
}
