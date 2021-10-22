import java.text.NumberFormat;

public class Foramtting_1 {
    public static void main(String[] args) {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(123456789.199);
    System.out.println(result); 
    }
} 
