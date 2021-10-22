public class Casting_1 {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short >int > long > float > double
        // short x = 1;
        // double x = 1.1;
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        // int y = (int)x + 2;
        // double y = x + 2;
        System.out.println(y);
    }
}
