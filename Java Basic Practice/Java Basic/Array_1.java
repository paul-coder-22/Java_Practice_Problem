import java.util.Arrays;
public class Array_1 {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // numbers[3] = 4;
        // numbers[4] = 5;
        int [] numbers = {6,3,4,5,2};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
