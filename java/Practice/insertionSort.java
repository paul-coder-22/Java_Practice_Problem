import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        
        int value[] = {11,2,32,21,76,6};
        for (int i = 0; i < (value.length);i++){
            int curr_ele = value[i];
            int pos = i ;
            while (pos != 0 && curr_ele < value[pos-1]) {
                value[pos] = value[pos-1];
                pos = pos - 1;
            value[pos] = curr_ele;
            }
        }
        System.out.println(Arrays.toString(value));
    }
}
