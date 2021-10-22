import java.util.Arrays;

public class bubble_sort {

    public static void main(String[] args) {
        // int i;
        int value [] = {11,2,32,21,76,9};
        for (int i = 0; i < (value.length) - 1 ; i ++){
            for (int j = 0 ; j < (value.length) - i - 1 ; j++){
                if (value[j] > value[j+1]){
                    int temp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(value));
    }
}
