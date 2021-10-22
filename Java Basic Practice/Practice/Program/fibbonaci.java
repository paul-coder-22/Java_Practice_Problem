import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int preNum = 0;
        int nextNum = 1;
        for (int i = 0 ; i <= 10 ; i ++){
            System.out.println(preNum);
            int temp = preNum;
            preNum = nextNum;
            nextNum = temp + preNum;
        }
    }
}
